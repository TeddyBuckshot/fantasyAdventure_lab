package rooms;

import players.Character;
import rooms.challenege.IChallenge;
import rooms.challenege.Treasure;

public abstract class Room {

    private String name;
    private IChallenge challenge;
    private boolean complete;

    public Room(String name, IChallenge challenge) {
        this.name = name;
        this.challenge = challenge;
        this.complete = false;
    }

    public boolean getChallangeStatus(){
        return this.complete;
    }

    public void setChallengeStatus(){
        this.complete = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IChallenge getChallenge() {
        return challenge;
    }

    public void setChallenge(IChallenge challenge) {
        this.challenge = challenge;
    }

    public void completeChallenge(Character character) {
        character.collectTreasure(challenge.getPoints());
        setChallengeStatus();
    }
}
