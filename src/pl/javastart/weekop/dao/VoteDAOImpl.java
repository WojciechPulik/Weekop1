package pl.javastart.weekop.dao;

import java.util.List;
import pl.javastart.weekop.model.Vote;

public class VoteDAOImpl implements VoteDAO{
	
	@Override
	public Vote create(Vote newObject) {
		return null;
	}
	
	@Override
	public Vote read(Long primaryKey) {
		return null;
	}
	
	@Override
	public boolean update(Vote updateObject) {
		return false;
	}
	
	@Override
	public boolean delete(Long key) {
		return false;
	}
	
	@Override
	public List<Vote> getAll(){
		return null;
	}
	
	public Vote getVoteByUserIdDiscoveryId(long userid, long discoveryid) {
		return null;
	}

}
