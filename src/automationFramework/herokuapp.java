package automationFramework;

import common.DriverLoader;
import common.PropertiesLoader;
import pageObjects.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class herokuapp {

	static PropertiesLoader prop = PropertiesLoader.getInstance();

	public static void main(String args[]) throws InterruptedException, IOException {
		String url = "https://responsivefight.herokuapp.com/";

		DriverLoader d = new DriverLoader();
		d.launchBrowser(url);

		LoginPage login = new LoginPage(DriverLoader.driver);
		AreYouGame rUGame = new AreYouGame(DriverLoader.driver);
		TakeTheBus takeTheBus = new TakeTheBus(DriverLoader.driver);
		PublicPlace publicPlace = new PublicPlace(DriverLoader.driver);
		Office office = new Office(DriverLoader.driver);
		checkLeaderBoard checkLeaderBoard = new checkLeaderBoard(DriverLoader.driver);


		String currentTime = new SimpleDateFormat("ddHHmmss").format(Calendar.getInstance().getTime());
		login.enterWarriorName("AK"+currentTime);
		login.clickStart();

		//Click on Are You Game
		rUGame.selectAreUGame();
		//Click on Take The Bus
		takeTheBus.selectTakeTheBus();
		//Click on Go to a Public Place
		publicPlace.selectPublicPlace();
		//Click on Go to Office
		office.selectOffice();
		//Check the score on Leadership Board
		checkLeaderBoard.checkScore("AK"+currentTime);

	}

}
