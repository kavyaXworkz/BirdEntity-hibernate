package birdEntityDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="birdentity")

public class BirdEntity {
	@Column(name="id")
	@Id
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="place")
	private String place;
	@Column(name="colour")
	private String colour;
	@Column(name="food")
	private String food;
	public BirdEntity(int id,String name, String place, String colour, String food) {
		super();
		this.id=id;
		this.name = name;
		this.place = place;
		this.colour = colour;
		this.food = food;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	@Override
	public String toString() {
		return "BirdEntity [id=" + id + ", name=" + name + ", place=" + place + ", colour=" + colour + ", food=" + food
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BirdEntity other = (BirdEntity) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
