package nextstep.subway.applicaion.line.domain;

import nextstep.subway.applicaion.station.domain.Station;

import javax.persistence.*;
import java.util.List;

@Entity
public class Line {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true)
	private String name;
	private String color;
	private Long upStationId;
	private Long downStationId;
	@OneToMany(mappedBy = "line", cascade = CascadeType.ALL)
	private List<LineStation> stations;
	private Integer distance;

	public Line() {
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public Long getUpStationId() {
		return upStationId;
	}

	public Long getDownStationId() {
		return downStationId;
	}

	public Line(String name, String color, Long upStationId, Long downStationId, Integer distance) {
		this.name = name;
		this.color = color;
		this.upStationId = upStationId;
		this.downStationId = downStationId;
		this.distance = distance;
	}

	public void updateLine(String name, String color) {
		this.name = name;
		this.color = color;
	}
}
