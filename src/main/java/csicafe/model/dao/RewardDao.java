package csicafe.model.dao;

import java.util.List;

import csicafe.model.Reward;

public interface RewardDao {

    Reward getReward( Long id );

    List<Reward> getRewards();

 
}