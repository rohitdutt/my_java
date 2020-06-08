package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="player")
public class Player{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jersey_no;

    @Column(name = "player_name", nullable = false)
    private String player_name;

    @Column(name = "nation", nullable = false)
    private String nation;

    @Column(name = "position", nullable = false)
    private String position;

    @Column(name = "age", nullable = false)
    private String age;

    @Column(name = "goals_scored", nullable = false)
    private int goals_scored;

    @Column(name = "matches_played", nullable = false)
    private int matches_played;

    @Column(name = "photo", nullable = false)
    private String photo;

    @Column(name = "more", nullable = false)
    private String more;

    public Player(int jerseyNo, String playerName, String nation, String position, String age, int goalScored, int matchesPlayed, String photo, String more) {
        this.jersey_no = jerseyNo;
        this.player_name = playerName;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.goals_scored = goalScored;
        this.matches_played = matchesPlayed;
        this.photo = photo;
        this.more = more;
    }

    public Player() {
        super();
    }

    public int getJerseyNo() {
        return jersey_no;
    }

    public void setJerseyNo(int jerseyNo) {
        this.jersey_no = jerseyNo;
    }

    public String getPlayerName() {
        return player_name;
    }

    public void setPlayerName(String playerName) {
        this.player_name = playerName;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getGoalScored() {
        return goals_scored;
    }

    public void setGoalScored(int goalScored) {
        this.goals_scored = goalScored;
    }

    public int getMatchesPlayed() {
        return matches_played;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matches_played = matchesPlayed;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }
}
