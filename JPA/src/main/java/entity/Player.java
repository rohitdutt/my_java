package entity;

import javax.persistence.*;

@Entity
@Table(name="player")
public class Player {
    @Id
    private int jersey_no;
    private String player_name;
    private String nation;
    private String position;
    private int age;
    private int goals_scored ;
    private int matches_played;
    private String photo;
    private String more;

    public Player(int jerseyNo, String playerName, String nation, String position, int age, int goalScored, int matchesPlayed, String photo, String more) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGoalScored() {
        return goals_scored ;
    }

    public void setGoalScored(int goalScored) {
        this.goals_scored  = goalScored;
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
