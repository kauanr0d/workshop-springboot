package com.kauanrodrigues.course.entities;

import java.io.Serializable;
import java.util.Objects;

import com.kauanrodrigues.course.entities.pk.OrderItemPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_order_item")
public class OrdemItem implements Serializable {

	@EmbeddedId
	private OrderItemPK id;

	private Integer quantity;

	private Double price;

	public Double subTotal() {
		return 0.0;
	}

	public OrdemItem(Order order, Product product, Integer quantity, Double price) {
		super();
		this.id.setOrder(order);
		this.id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}

	public Order getOrder() {
		return this.id.getOrder();
	}

	public void setOrder(Order order) {
		this.id.setOrder(order);
	}

	public Product getProduct() {
		return this.id.getProduct();
	}

	public void setProduct(Product product) {
		this.id.setProduct(product);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrdemItem other = (OrdemItem) obj;
		return Objects.equals(id, other.id);
	}

	public OrdemItem() {
		super();
	}

}
