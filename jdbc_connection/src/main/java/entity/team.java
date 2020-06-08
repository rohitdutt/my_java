package entity;

public class team {
    String id;
    String teamName;
    String state;
    String owner;
    float valuation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getValuation() {
        return valuation;
    }

    public void setValuation(float valuation) {
        this.valuation = valuation;
    }

    @Override
    public String toString() {
        return "team{" +
                "id='" + id + '\'' +
                ", teamName='" + teamName + '\'' +
                ", state='" + state + '\'' +
                ", owner='" + owner + '\'' +
                ", valuation=" + valuation +
                '}';
    }
}
