package controllers;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import interfaces.IRssFeedService;
import models.LotteryResult;
import services.RssFeedService;

@RunWith(MockitoJUnitRunner.class)
public class RssFeedServiceTest {
	@Mock
	IRssFeedService rssFeedService;
	
	@Test
	public void shouldReadRss() {
		String url = "http://xskt.com.vn/rss-feed/tp-hcm-xshcm.rss";
		rssFeedService = new RssFeedService(url);
		rssFeedService.readRssFeed();
		Assert.assertFalse(StringUtils.isEmpty(rssFeedService.getPureRssFeed()));
	}
	
	@Test
	public void shouldConvertRssFeedToDataModel() {
		String url = "http://xskt.com.vn/rss-feed/tp-hcm-xshcm.rss";
		rssFeedService = new RssFeedService(url);
		rssFeedService.readRssFeed();
		List<LotteryResult> lotteryResults = rssFeedService.getLotteryResults();
		Assert.assertTrue(lotteryResults.size() > 0);
	}
	
}
