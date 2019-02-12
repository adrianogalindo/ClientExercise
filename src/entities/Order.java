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
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
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

	//  This setter is not supposed to change the standard list
	//	public void setOrderItens(List<OrderItem> orderItens) {
	//		this.orderItens = orderItens;
	//	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem orderItens_) {
		orderItens.add(orderItens_);
	}

	public void removeItem(OrderItem orderItens_) {
		orderItens.remove(orderItens_);
	}

	public Double total() {
		double sum = 0.0;
		for (OrderItem orderItens_ : orderItens) {
			sum += orderItens_.subTotal();
		}
		return sum;
	}
}

