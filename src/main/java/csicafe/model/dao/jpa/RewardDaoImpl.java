package csicafe.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import csicafe.model.Reward;
import csicafe.model.dao.RewardDao;

@Repository
public class RewardDaoImpl implements RewardDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Reward getReward(Long id) {
		return entityManager.find(Reward.class, id);
	}

	@Override
	public List<Reward> getRewards() {
		return entityManager.createQuery("from Reward", Reward.class).getResultList();
	}

}
