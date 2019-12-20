package pl.javastart.weekop.model;

import java.sql.Timestamp;

public class Vote {
	private long id;
	private long discoveryid;
	private long userid;
	private Timestamp date;
	private VoteType voteType;
	
	public Vote() {}

	public Vote(Vote vote) {
		super();
		this.id = vote.id;
		this.discoveryid = vote.discoveryid;
		this.userid = vote.userid;
		this.date = new Timestamp(vote.date.getTime());
		this.voteType = vote.voteType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDiscoveryid() {
		return discoveryid;
	}

	public void setDiscoveryid(long discoveryid) {
		this.discoveryid = discoveryid;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public VoteType getVoteType() {
		return voteType;
	}

	public void setVoteType(VoteType voteType) {
		this.voteType = voteType;
	}

	@Override
	public String toString() {
		return "Vote [id=" + id + ", discoveryid=" + discoveryid + ", userid=" + userid + ", date=" + date
				+ ", voteType=" + voteType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + (int) (discoveryid ^ (discoveryid >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (userid ^ (userid >>> 32));
		result = prime * result + ((voteType == null) ? 0 : voteType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vote other = (Vote) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (discoveryid != other.discoveryid)
			return false;
		if (id != other.id)
			return false;
		if (userid != other.userid)
			return false;
		if (voteType != other.voteType)
			return false;
		return true;
	}
	
	
	
	

}
