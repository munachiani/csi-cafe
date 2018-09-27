package csicafe.api.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import csicafe.model.Reward;
import csicafe.model.dao.RewardDao;


@RestController
public class RewradController {
	
	@Autowired
	private RewardDao rewardDao;
	
	@RequestMapping(value= "/rewards/{id}", method = RequestMethod.GET)
	public Reward getEvent(@PathVariable Long id) {
		
		return rewardDao.getReward(id);
		
	}
	
	  @RequestMapping(value = "/rewards", method = RequestMethod.GET)
	    public List<Reward> getRwards()
	    {
	        return rewardDao.getRewards();
	    }
	
	

}
