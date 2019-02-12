package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> orderItens = new ArrayList<>();
	
	public Order() {
	}

	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrderItens() {
		return orderItens;
	}

//  This setter is not supposed to change the standard list
//	public void setOrderItens(List<OrderItem> orderItens) {
//		this.orderItens = orderItens;
//	}
	
	public void addItem(OrderItem orderItens_) {
		orderItens.add(orderItens_);
	}
	
	public void removeItem(OrderItem orderItens_) {
		orderItens.remove(orderItens_);
	}
	
	public Double total(OrderItem orderItens) {
			double sum;
			Calendar cal = Calendar.getInstance();
			for(OrderItem o : orderItens) {
				cal.setTime(o.getDate());
				int c_year = cal.get(Calendar.YEAR);
				int c_month = 1 + cal.get(Calendar.MONTH); 
				if( c_year == year && c_month == month) {
					sum += c.totalValue();
				}
			}
			return sum;
		}
	}
	
	
	
	
}
