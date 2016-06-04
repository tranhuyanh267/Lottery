package services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import interfaces.IRssFeedService;
import models.LotteryResult;

public class RssFeedService implements IRssFeedService{

	final private String urlAddress;
	private String pureRssFeed;
	private List<LotteryResult> lotteryResults;
	
	public RssFeedService(String urlAddress) {
		this.urlAddress = urlAddress;
	}
	
	public void readRssFeed() {
		try {
			URL url = new URL(urlAddress);
			BufferedReader bufferReader = new BufferedReader(new InputStreamReader(url.openStream()));
			String line = "";
			while ((line = bufferReader.readLine()) != null) {
				//System.out.println(line);
				pureRssFeed +=  line;
			}
			bufferReader.close();
		} catch (Exception e) {
			System.out.println("Cannot read URL: " +  urlAddress);
		}
	}

	@Override
	public String getPureRssFeed() {
		return pureRssFeed;
	}

	@Override
	public List<LotteryResult> getLotteryResults() {
		lotteryResults = new ArrayList<>();
		lotteryResults.add(new LotteryResult());
		return lotteryResults;
	}

}
