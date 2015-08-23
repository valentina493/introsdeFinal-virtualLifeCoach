package processlogicservice.model;

import java.awt.geom.Point2D;
import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class LinearFitterComputeYInput implements Serializable{
	private static final long serialVersionUID = -7626806777932640516L;
	@XmlElement double x;
	@XmlElement List<Point2D.Double> inputPoints;
	
	public LinearFitterComputeYInput(){}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public List<Point2D.Double> getInputPoints() {
		return inputPoints;
	}

	public void setInputPoints(List<Point2D.Double> inputPoints) {
		this.inputPoints = inputPoints;
	}
	
	
}