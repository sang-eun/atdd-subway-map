package nextstep.subway.applicaion.station.domain;

import nextstep.subway.applicaion.line.domain.LineStation;

import javax.persistence.*;
import java.util.List;

@Entity
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "station", cascade = CascadeType.ALL)
    private List<LineStation> lines;

    public Station() {
    }

    public Station(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
