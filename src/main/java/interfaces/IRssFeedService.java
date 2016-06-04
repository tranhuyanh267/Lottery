package interfaces;

import java.util.List;

import models.LotteryResult;

public interface IRssFeedService {
	void readRssFeed();
	String getPureRssFeed();
	List<LotteryResult> getLotteryResults();
}
