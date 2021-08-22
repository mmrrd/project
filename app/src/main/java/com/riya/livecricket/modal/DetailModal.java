package com.riya.livecricket.modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DetailModal {

    @SerializedName("Fixture")
    @Expose
    private Fixture fixture;

    public Fixture getFixture() {
        return fixture;
    }

    public void setFixture(Fixture fixture) {
        this.fixture = fixture;
    }

    @SerializedName("Players")
    @Expose
    private List<Player> players = null;
    @SerializedName("ResponseError")
    @Expose
    private Boolean responseError;

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Boolean getResponseError() {
        return responseError;
    }

    public void setResponseError(Boolean responseError) {
        this.responseError = responseError;
    }


    public class AwayTeam {

        @SerializedName("Id")
        @Expose
        private Integer id;
        @SerializedName("Name")
        @Expose
        private String name;
        @SerializedName("ShortName")
        @Expose
        private String shortName;
        @SerializedName("TeamColor")
        @Expose
        private String teamColor;
        @SerializedName("LogoUrl")
        @Expose
        private String logoUrl;
        @SerializedName("BackgroundImageUrl")
        @Expose
        private String backgroundImageUrl;
        @SerializedName("TeambadgeImageUrl")
        @Expose
        private String teambadgeImageUrl;
        @SerializedName("IsHomeTeam")
        @Expose
        private Boolean isHomeTeam;
        @SerializedName("IsTossWinner")
        @Expose
        private Boolean isTossWinner;
        @SerializedName("IsMatchWinner")
        @Expose
        private Boolean isMatchWinner;
        @SerializedName("BattingBonus")
        @Expose
        private Integer battingBonus;
        @SerializedName("BowlingBonus")
        @Expose
        private Integer bowlingBonus;
        @SerializedName("IsActive")
        @Expose
        private Boolean isActive;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getShortName() {
            return shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public String getTeamColor() {
            return teamColor;
        }

        public void setTeamColor(String teamColor) {
            this.teamColor = teamColor;
        }

        public String getLogoUrl() {
            return logoUrl;
        }

        public void setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
        }

        public String getBackgroundImageUrl() {
            return backgroundImageUrl;
        }

        public void setBackgroundImageUrl(String backgroundImageUrl) {
            this.backgroundImageUrl = backgroundImageUrl;
        }

        public String getTeambadgeImageUrl() {
            return teambadgeImageUrl;
        }

        public void setTeambadgeImageUrl(String teambadgeImageUrl) {
            this.teambadgeImageUrl = teambadgeImageUrl;
        }

        public Boolean getIsHomeTeam() {
            return isHomeTeam;
        }

        public void setIsHomeTeam(Boolean isHomeTeam) {
            this.isHomeTeam = isHomeTeam;
        }

        public Boolean getIsTossWinner() {
            return isTossWinner;
        }

        public void setIsTossWinner(Boolean isTossWinner) {
            this.isTossWinner = isTossWinner;
        }

        public Boolean getIsMatchWinner() {
            return isMatchWinner;
        }

        public void setIsMatchWinner(Boolean isMatchWinner) {
            this.isMatchWinner = isMatchWinner;
        }

        public Integer getBattingBonus() {
            return battingBonus;
        }

        public void setBattingBonus(Integer battingBonus) {
            this.battingBonus = battingBonus;
        }

        public Integer getBowlingBonus() {
            return bowlingBonus;
        }

        public void setBowlingBonus(Integer bowlingBonus) {
            this.bowlingBonus = bowlingBonus;
        }

        public Boolean getIsActive() {
            return isActive;
        }

        public void setIsActive(Boolean isActive) {
            this.isActive = isActive;
        }

    }
    public class Batsman {

        @SerializedName("PlayerId")
        @Expose
        private Integer playerId;
        @SerializedName("BallsFaced")
        @Expose
        private Integer ballsFaced;
        @SerializedName("BowledByPlayerId")
        @Expose
        private Integer bowledByPlayerId;
        @SerializedName("DismissalTypeId")
        @Expose
        private String dismissalTypeId;
        @SerializedName("DismissedByPlayerId")
        @Expose
        private Integer dismissedByPlayerId;
        @SerializedName("DismissalText")
        @Expose
        private String dismissalText;
        @SerializedName("BattingStartDay")
        @Expose
        private Integer battingStartDay;
        @SerializedName("FoursScored")
        @Expose
        private Integer foursScored;
        @SerializedName("SixesScored")
        @Expose
        private Integer sixesScored;
        @SerializedName("RunsScored")
        @Expose
        private Integer runsScored;
        @SerializedName("BattingMinutes")
        @Expose
        private Integer battingMinutes;
        @SerializedName("IsOnStrike")
        @Expose
        private Boolean isOnStrike;
        @SerializedName("IsBatting")
        @Expose
        private Boolean isBatting;
        @SerializedName("BattingOrder")
        @Expose
        private Integer battingOrder;
        @SerializedName("IsOut")
        @Expose
        private Boolean isOut;
        @SerializedName("StrikeRate")
        @Expose
        private Integer strikeRate;

        public Integer getPlayerId() {
            return playerId;
        }

        public void setPlayerId(Integer playerId) {
            this.playerId = playerId;
        }

        public Integer getBallsFaced() {
            return ballsFaced;
        }

        public void setBallsFaced(Integer ballsFaced) {
            this.ballsFaced = ballsFaced;
        }

        public Integer getBowledByPlayerId() {
            return bowledByPlayerId;
        }

        public void setBowledByPlayerId(Integer bowledByPlayerId) {
            this.bowledByPlayerId = bowledByPlayerId;
        }

        public String getDismissalTypeId() {
            return dismissalTypeId;
        }

        public void setDismissalTypeId(String dismissalTypeId) {
            this.dismissalTypeId = dismissalTypeId;
        }

        public Integer getDismissedByPlayerId() {
            return dismissedByPlayerId;
        }

        public void setDismissedByPlayerId(Integer dismissedByPlayerId) {
            this.dismissedByPlayerId = dismissedByPlayerId;
        }

        public String getDismissalText() {
            return dismissalText;
        }

        public void setDismissalText(String dismissalText) {
            this.dismissalText = dismissalText;
        }

        public Integer getBattingStartDay() {
            return battingStartDay;
        }

        public void setBattingStartDay(Integer battingStartDay) {
            this.battingStartDay = battingStartDay;
        }

        public Integer getFoursScored() {
            return foursScored;
        }

        public void setFoursScored(Integer foursScored) {
            this.foursScored = foursScored;
        }

        public Integer getSixesScored() {
            return sixesScored;
        }

        public void setSixesScored(Integer sixesScored) {
            this.sixesScored = sixesScored;
        }

        public Integer getRunsScored() {
            return runsScored;
        }

        public void setRunsScored(Integer runsScored) {
            this.runsScored = runsScored;
        }

        public Integer getBattingMinutes() {
            return battingMinutes;
        }

        public void setBattingMinutes(Integer battingMinutes) {
            this.battingMinutes = battingMinutes;
        }

        public Boolean getIsOnStrike() {
            return isOnStrike;
        }

        public void setIsOnStrike(Boolean isOnStrike) {
            this.isOnStrike = isOnStrike;
        }

        public Boolean getIsBatting() {
            return isBatting;
        }

        public void setIsBatting(Boolean isBatting) {
            this.isBatting = isBatting;
        }

        public Integer getBattingOrder() {
            return battingOrder;
        }

        public void setBattingOrder(Integer battingOrder) {
            this.battingOrder = battingOrder;
        }

        public Boolean getIsOut() {
            return isOut;
        }

        public void setIsOut(Boolean isOut) {
            this.isOut = isOut;
        }

        public Integer getStrikeRate() {
            return strikeRate;
        }

        public void setStrikeRate(Integer strikeRate) {
            this.strikeRate = strikeRate;
        }

    }
    public class Bowler {

        @SerializedName("PlayerId")
        @Expose
        private Integer playerId;
        @SerializedName("OversBowled")
        @Expose
        private String oversBowled;
        @SerializedName("MaidensBowled")
        @Expose
        private Integer maidensBowled;
        @SerializedName("BallsBowled")
        @Expose
        private Integer ballsBowled;
        @SerializedName("DotBalls")
        @Expose
        private Integer dotBalls;
        @SerializedName("NoBalls")
        @Expose
        private Integer noBalls;
        @SerializedName("WideBalls")
        @Expose
        private Integer wideBalls;
        @SerializedName("Order")
        @Expose
        private Integer order;
        @SerializedName("RunsConceded")
        @Expose
        private Integer runsConceded;
        @SerializedName("WicketsTaken")
        @Expose
        private Integer wicketsTaken;
        @SerializedName("IsOnStrike")
        @Expose
        private Boolean isOnStrike;
        @SerializedName("IsNonStrike")
        @Expose
        private Boolean isNonStrike;
        @SerializedName("Economy")
        @Expose
        private Integer economy;

        public Integer getPlayerId() {
            return playerId;
        }

        public void setPlayerId(Integer playerId) {
            this.playerId = playerId;
        }

        public String getOversBowled() {
            return oversBowled;
        }

        public void setOversBowled(String oversBowled) {
            this.oversBowled = oversBowled;
        }

        public Integer getMaidensBowled() {
            return maidensBowled;
        }

        public void setMaidensBowled(Integer maidensBowled) {
            this.maidensBowled = maidensBowled;
        }

        public Integer getBallsBowled() {
            return ballsBowled;
        }

        public void setBallsBowled(Integer ballsBowled) {
            this.ballsBowled = ballsBowled;
        }

        public Integer getDotBalls() {
            return dotBalls;
        }

        public void setDotBalls(Integer dotBalls) {
            this.dotBalls = dotBalls;
        }

        public Integer getNoBalls() {
            return noBalls;
        }

        public void setNoBalls(Integer noBalls) {
            this.noBalls = noBalls;
        }

        public Integer getWideBalls() {
            return wideBalls;
        }

        public void setWideBalls(Integer wideBalls) {
            this.wideBalls = wideBalls;
        }

        public Integer getOrder() {
            return order;
        }

        public void setOrder(Integer order) {
            this.order = order;
        }

        public Integer getRunsConceded() {
            return runsConceded;
        }

        public void setRunsConceded(Integer runsConceded) {
            this.runsConceded = runsConceded;
        }

        public Integer getWicketsTaken() {
            return wicketsTaken;
        }

        public void setWicketsTaken(Integer wicketsTaken) {
            this.wicketsTaken = wicketsTaken;
        }

        public Boolean getIsOnStrike() {
            return isOnStrike;
        }

        public void setIsOnStrike(Boolean isOnStrike) {
            this.isOnStrike = isOnStrike;
        }

        public Boolean getIsNonStrike() {
            return isNonStrike;
        }

        public void setIsNonStrike(Boolean isNonStrike) {
            this.isNonStrike = isNonStrike;
        }

        public Integer getEconomy() {
            return economy;
        }

        public void setEconomy(Integer economy) {
            this.economy = economy;
        }

    }
    public class Competition {

        @SerializedName("Id")
        @Expose
        private Integer id;
        @SerializedName("Name")
        @Expose
        private String name;
        @SerializedName("Url")
        @Expose
        private String url;
        @SerializedName("ImageUrl")
        @Expose
        private String imageUrl;
        @SerializedName("BannerImageUrl")
        @Expose
        private String bannerImageUrl;
        @SerializedName("DrinksNotificationEnabled")
        @Expose
        private Boolean drinksNotificationEnabled;
        @SerializedName("Order")
        @Expose
        private Integer order;
        @SerializedName("TwitterHandle")
        @Expose
        private String twitterHandle;
        @SerializedName("StartDateTime")
        @Expose
        private String startDateTime;
        @SerializedName("EndDateTime")
        @Expose
        private String endDateTime;
        @SerializedName("ThemeUrl")
        @Expose
        private String themeUrl;
        @SerializedName("ViewerVerdict")
        @Expose
        private Boolean viewerVerdict;
        @SerializedName("Priority")
        @Expose
        private String priority;
        @SerializedName("StatisticsProvider")
        @Expose
        private String statisticsProvider;
        @SerializedName("RelatedSeriesIds")
        @Expose
        private String relatedSeriesIds;
        @SerializedName("IsWomensCompetition")
        @Expose
        private Boolean isWomensCompetition;
        @SerializedName("Formats")
        @Expose
        private List<Format> formats = null;
        @SerializedName("LegacyCompetitionId")
        @Expose
        private Integer legacyCompetitionId;
        @SerializedName("IsPublished")
        @Expose
        private Boolean isPublished;
        @SerializedName("SitecoreId")
        @Expose
        private String sitecoreId;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getBannerImageUrl() {
            return bannerImageUrl;
        }

        public void setBannerImageUrl(String bannerImageUrl) {
            this.bannerImageUrl = bannerImageUrl;
        }

        public Boolean getDrinksNotificationEnabled() {
            return drinksNotificationEnabled;
        }

        public void setDrinksNotificationEnabled(Boolean drinksNotificationEnabled) {
            this.drinksNotificationEnabled = drinksNotificationEnabled;
        }

        public Integer getOrder() {
            return order;
        }

        public void setOrder(Integer order) {
            this.order = order;
        }

        public String getTwitterHandle() {
            return twitterHandle;
        }

        public void setTwitterHandle(String twitterHandle) {
            this.twitterHandle = twitterHandle;
        }

        public String getStartDateTime() {
            return startDateTime;
        }

        public void setStartDateTime(String startDateTime) {
            this.startDateTime = startDateTime;
        }

        public String getEndDateTime() {
            return endDateTime;
        }

        public void setEndDateTime(String endDateTime) {
            this.endDateTime = endDateTime;
        }

        public String getThemeUrl() {
            return themeUrl;
        }

        public void setThemeUrl(String themeUrl) {
            this.themeUrl = themeUrl;
        }

        public Boolean getViewerVerdict() {
            return viewerVerdict;
        }

        public void setViewerVerdict(Boolean viewerVerdict) {
            this.viewerVerdict = viewerVerdict;
        }

        public String getPriority() {
            return priority;
        }

        public void setPriority(String priority) {
            this.priority = priority;
        }

        public String getStatisticsProvider() {
            return statisticsProvider;
        }

        public void setStatisticsProvider(String statisticsProvider) {
            this.statisticsProvider = statisticsProvider;
        }

        public String getRelatedSeriesIds() {
            return relatedSeriesIds;
        }

        public void setRelatedSeriesIds(String relatedSeriesIds) {
            this.relatedSeriesIds = relatedSeriesIds;
        }

        public Boolean getIsWomensCompetition() {
            return isWomensCompetition;
        }

        public void setIsWomensCompetition(Boolean isWomensCompetition) {
            this.isWomensCompetition = isWomensCompetition;
        }

        public List<Format> getFormats() {
            return formats;
        }

        public void setFormats(List<Format> formats) {
            this.formats = formats;
        }

        public Integer getLegacyCompetitionId() {
            return legacyCompetitionId;
        }

        public void setLegacyCompetitionId(Integer legacyCompetitionId) {
            this.legacyCompetitionId = legacyCompetitionId;
        }

        public Boolean getIsPublished() {
            return isPublished;
        }

        public void setIsPublished(Boolean isPublished) {
            this.isPublished = isPublished;
        }

        public String getSitecoreId() {
            return sitecoreId;
        }

        public void setSitecoreId(String sitecoreId) {
            this.sitecoreId = sitecoreId;
        }

    }

    public class Fixture {

        @SerializedName("Competition")
        @Expose
        private Competition competition;
        @SerializedName("HomeTeam")
        @Expose
        private HomeTeam homeTeam;
        @SerializedName("AwayTeam")
        @Expose
        private AwayTeam awayTeam;
        @SerializedName("Venue")
        @Expose
        private Venue venue;
        @SerializedName("Innings")
        @Expose
        private List<Inning> innings = null;
        @SerializedName("Id")
        @Expose
        private Integer id;
        @SerializedName("Name")
        @Expose
        private String name;
        @SerializedName("StartDateTime")
        @Expose
        private String startDateTime;
        @SerializedName("EndDateTime")
        @Expose
        private String endDateTime;
        @SerializedName("GameTypeId")
        @Expose
        private Integer gameTypeId;
        @SerializedName("GameType")
        @Expose
        private String gameType;
        @SerializedName("IsLive")
        @Expose
        private Boolean isLive;
        @SerializedName("IsCompleted")
        @Expose
        private Boolean isCompleted;
        @SerializedName("IsDuckworthLewis")
        @Expose
        private Boolean isDuckworthLewis;
        @SerializedName("MatchDay")
        @Expose
        private Integer matchDay;
        @SerializedName("NumberOfDays")
        @Expose
        private Integer numberOfDays;
        @SerializedName("ResultText")
        @Expose
        private String resultText;
        @SerializedName("ResultTypeId")
        @Expose
        private String resultTypeId;
        @SerializedName("ResultType")
        @Expose
        private String resultType;
        @SerializedName("GameStatusId")
        @Expose
        private String gameStatusId;
        @SerializedName("GameStatus")
        @Expose
        private String gameStatus;
        @SerializedName("TossResult")
        @Expose
        private String tossResult;
        @SerializedName("TossDecision")
        @Expose
        private String tossDecision;
        @SerializedName("WinningMargin")
        @Expose
        private Integer winningMargin;
        @SerializedName("WinTypeId")
        @Expose
        private String winTypeId;
        @SerializedName("WinType")
        @Expose
        private String winType;
        @SerializedName("TicketUrl")
        @Expose
        private String ticketUrl;
        @SerializedName("Featured")
        @Expose
        private Boolean featured;
        @SerializedName("IsWomensMatch")
        @Expose
        private Boolean isWomensMatch;
        @SerializedName("FanHashTag")
        @Expose
        private String fanHashTag;
        @SerializedName("TwitterHandle")
        @Expose
        private String twitterHandle;
        @SerializedName("SocialEventId")
        @Expose
        private String socialEventId;
        @SerializedName("TuneIn")
        @Expose
        private Boolean tuneIn;
        @SerializedName("MatchDayHomePageImageUrl")
        @Expose
        private String matchDayHomePageImageUrl;
        @SerializedName("FanSocialEventId")
        @Expose
        private String fanSocialEventId;
        @SerializedName("IsVideoReplays")
        @Expose
        private Boolean isVideoReplays;
        @SerializedName("GamedayStatus")
        @Expose
        private String gamedayStatus;
        @SerializedName("IsEnableGameday")
        @Expose
        private Boolean isEnableGameday;
        @SerializedName("MoreInfoUrl")
        @Expose
        private String moreInfoUrl;
        @SerializedName("OversRemaining")
        @Expose
        private String oversRemaining;
        @SerializedName("Order")
        @Expose
        private Integer order;
        @SerializedName("CompetitionId")
        @Expose
        private Integer competitionId;
        @SerializedName("VenueId")
        @Expose
        private Integer venueId;
        @SerializedName("HomeTeamId")
        @Expose
        private Integer homeTeamId;
        @SerializedName("AwayTeamId")
        @Expose
        private Integer awayTeamId;
        @SerializedName("Channels")
        @Expose
        private List<Object> channels = null;
        @SerializedName("Officials")
        @Expose
        private List<Official> officials = null;
        @SerializedName("LegacyFixtureId")
        @Expose
        private Integer legacyFixtureId;
        @SerializedName("IsInProgress")
        @Expose
        private Boolean isInProgress;
        @SerializedName("TotalOvers")
        @Expose
        private String totalOvers;
        @SerializedName("IsPublished")
        @Expose
        private Boolean isPublished;

        public Competition getCompetition() {
            return competition;
        }

        public void setCompetition(Competition competition) {
            this.competition = competition;
        }

        public HomeTeam getHomeTeam() {
            return homeTeam;
        }

        public void setHomeTeam(HomeTeam homeTeam) {
            this.homeTeam = homeTeam;
        }

        public AwayTeam getAwayTeam() {
            return awayTeam;
        }

        public void setAwayTeam(AwayTeam awayTeam) {
            this.awayTeam = awayTeam;
        }

        public Venue getVenue() {
            return venue;
        }

        public void setVenue(Venue venue) {
            this.venue = venue;
        }

        public List<Inning> getInnings() {
            return innings;
        }

        public void setInnings(List<Inning> innings) {
            this.innings = innings;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStartDateTime() {
            return startDateTime;
        }

        public void setStartDateTime(String startDateTime) {
            this.startDateTime = startDateTime;
        }

        public String getEndDateTime() {
            return endDateTime;
        }

        public void setEndDateTime(String endDateTime) {
            this.endDateTime = endDateTime;
        }

        public Integer getGameTypeId() {
            return gameTypeId;
        }

        public void setGameTypeId(Integer gameTypeId) {
            this.gameTypeId = gameTypeId;
        }

        public String getGameType() {
            return gameType;
        }

        public void setGameType(String gameType) {
            this.gameType = gameType;
        }

        public Boolean getIsLive() {
            return isLive;
        }

        public void setIsLive(Boolean isLive) {
            this.isLive = isLive;
        }

        public Boolean getIsCompleted() {
            return isCompleted;
        }

        public void setIsCompleted(Boolean isCompleted) {
            this.isCompleted = isCompleted;
        }

        public Boolean getIsDuckworthLewis() {
            return isDuckworthLewis;
        }

        public void setIsDuckworthLewis(Boolean isDuckworthLewis) {
            this.isDuckworthLewis = isDuckworthLewis;
        }

        public Integer getMatchDay() {
            return matchDay;
        }

        public void setMatchDay(Integer matchDay) {
            this.matchDay = matchDay;
        }

        public Integer getNumberOfDays() {
            return numberOfDays;
        }

        public void setNumberOfDays(Integer numberOfDays) {
            this.numberOfDays = numberOfDays;
        }

        public String getResultText() {
            return resultText;
        }

        public void setResultText(String resultText) {
            this.resultText = resultText;
        }

        public String getResultTypeId() {
            return resultTypeId;
        }

        public void setResultTypeId(String resultTypeId) {
            this.resultTypeId = resultTypeId;
        }

        public String getResultType() {
            return resultType;
        }

        public void setResultType(String resultType) {
            this.resultType = resultType;
        }

        public String getGameStatusId() {
            return gameStatusId;
        }

        public void setGameStatusId(String gameStatusId) {
            this.gameStatusId = gameStatusId;
        }

        public String getGameStatus() {
            return gameStatus;
        }

        public void setGameStatus(String gameStatus) {
            this.gameStatus = gameStatus;
        }

        public String getTossResult() {
            return tossResult;
        }

        public void setTossResult(String tossResult) {
            this.tossResult = tossResult;
        }

        public String getTossDecision() {
            return tossDecision;
        }

        public void setTossDecision(String tossDecision) {
            this.tossDecision = tossDecision;
        }

        public Integer getWinningMargin() {
            return winningMargin;
        }

        public void setWinningMargin(Integer winningMargin) {
            this.winningMargin = winningMargin;
        }

        public String getWinTypeId() {
            return winTypeId;
        }

        public void setWinTypeId(String winTypeId) {
            this.winTypeId = winTypeId;
        }

        public String getWinType() {
            return winType;
        }

        public void setWinType(String winType) {
            this.winType = winType;
        }

        public String getTicketUrl() {
            return ticketUrl;
        }

        public void setTicketUrl(String ticketUrl) {
            this.ticketUrl = ticketUrl;
        }

        public Boolean getFeatured() {
            return featured;
        }

        public void setFeatured(Boolean featured) {
            this.featured = featured;
        }

        public Boolean getIsWomensMatch() {
            return isWomensMatch;
        }

        public void setIsWomensMatch(Boolean isWomensMatch) {
            this.isWomensMatch = isWomensMatch;
        }

        public String getFanHashTag() {
            return fanHashTag;
        }

        public void setFanHashTag(String fanHashTag) {
            this.fanHashTag = fanHashTag;
        }

        public String getTwitterHandle() {
            return twitterHandle;
        }

        public void setTwitterHandle(String twitterHandle) {
            this.twitterHandle = twitterHandle;
        }

        public String getSocialEventId() {
            return socialEventId;
        }

        public void setSocialEventId(String socialEventId) {
            this.socialEventId = socialEventId;
        }

        public Boolean getTuneIn() {
            return tuneIn;
        }

        public void setTuneIn(Boolean tuneIn) {
            this.tuneIn = tuneIn;
        }

        public String getMatchDayHomePageImageUrl() {
            return matchDayHomePageImageUrl;
        }

        public void setMatchDayHomePageImageUrl(String matchDayHomePageImageUrl) {
            this.matchDayHomePageImageUrl = matchDayHomePageImageUrl;
        }

        public String getFanSocialEventId() {
            return fanSocialEventId;
        }

        public void setFanSocialEventId(String fanSocialEventId) {
            this.fanSocialEventId = fanSocialEventId;
        }

        public Boolean getIsVideoReplays() {
            return isVideoReplays;
        }

        public void setIsVideoReplays(Boolean isVideoReplays) {
            this.isVideoReplays = isVideoReplays;
        }

        public String getGamedayStatus() {
            return gamedayStatus;
        }

        public void setGamedayStatus(String gamedayStatus) {
            this.gamedayStatus = gamedayStatus;
        }

        public Boolean getIsEnableGameday() {
            return isEnableGameday;
        }

        public void setIsEnableGameday(Boolean isEnableGameday) {
            this.isEnableGameday = isEnableGameday;
        }

        public String getMoreInfoUrl() {
            return moreInfoUrl;
        }

        public void setMoreInfoUrl(String moreInfoUrl) {
            this.moreInfoUrl = moreInfoUrl;
        }

        public String getOversRemaining() {
            return oversRemaining;
        }

        public void setOversRemaining(String oversRemaining) {
            this.oversRemaining = oversRemaining;
        }

        public Integer getOrder() {
            return order;
        }

        public void setOrder(Integer order) {
            this.order = order;
        }

        public Integer getCompetitionId() {
            return competitionId;
        }

        public void setCompetitionId(Integer competitionId) {
            this.competitionId = competitionId;
        }

        public Integer getVenueId() {
            return venueId;
        }

        public void setVenueId(Integer venueId) {
            this.venueId = venueId;
        }

        public Integer getHomeTeamId() {
            return homeTeamId;
        }

        public void setHomeTeamId(Integer homeTeamId) {
            this.homeTeamId = homeTeamId;
        }

        public Integer getAwayTeamId() {
            return awayTeamId;
        }

        public void setAwayTeamId(Integer awayTeamId) {
            this.awayTeamId = awayTeamId;
        }

        public List<Object> getChannels() {
            return channels;
        }

        public void setChannels(List<Object> channels) {
            this.channels = channels;
        }

        public List<Official> getOfficials() {
            return officials;
        }

        public void setOfficials(List<Official> officials) {
            this.officials = officials;
        }

        public Integer getLegacyFixtureId() {
            return legacyFixtureId;
        }

        public void setLegacyFixtureId(Integer legacyFixtureId) {
            this.legacyFixtureId = legacyFixtureId;
        }

        public Boolean getIsInProgress() {
            return isInProgress;
        }

        public void setIsInProgress(Boolean isInProgress) {
            this.isInProgress = isInProgress;
        }

        public String getTotalOvers() {
            return totalOvers;
        }

        public void setTotalOvers(String totalOvers) {
            this.totalOvers = totalOvers;
        }

        public Boolean getIsPublished() {
            return isPublished;
        }

        public void setIsPublished(Boolean isPublished) {
            this.isPublished = isPublished;
        }

    }
    public class Format {

        @SerializedName("DisplayName")
        @Expose
        private String displayName;
        @SerializedName("AssociatedMatchType")
        @Expose
        private String associatedMatchType;
        @SerializedName("SeriesFormatName")
        @Expose
        private String seriesFormatName;

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getAssociatedMatchType() {
            return associatedMatchType;
        }

        public void setAssociatedMatchType(String associatedMatchType) {
            this.associatedMatchType = associatedMatchType;
        }

        public String getSeriesFormatName() {
            return seriesFormatName;
        }

        public void setSeriesFormatName(String seriesFormatName) {
            this.seriesFormatName = seriesFormatName;
        }

    }
    public class HomeTeam {

        @SerializedName("Id")
        @Expose
        private Integer id;
        @SerializedName("Name")
        @Expose
        private String name;
        @SerializedName("ShortName")
        @Expose
        private String shortName;
        @SerializedName("TeamColor")
        @Expose
        private String teamColor;
        @SerializedName("LogoUrl")
        @Expose
        private String logoUrl;
        @SerializedName("BackgroundImageUrl")
        @Expose
        private String backgroundImageUrl;
        @SerializedName("TeambadgeImageUrl")
        @Expose
        private String teambadgeImageUrl;
        @SerializedName("IsHomeTeam")
        @Expose
        private Boolean isHomeTeam;
        @SerializedName("IsTossWinner")
        @Expose
        private Boolean isTossWinner;
        @SerializedName("IsMatchWinner")
        @Expose
        private Boolean isMatchWinner;
        @SerializedName("BattingBonus")
        @Expose
        private Integer battingBonus;
        @SerializedName("BowlingBonus")
        @Expose
        private Integer bowlingBonus;
        @SerializedName("IsActive")
        @Expose
        private Boolean isActive;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getShortName() {
            return shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public String getTeamColor() {
            return teamColor;
        }

        public void setTeamColor(String teamColor) {
            this.teamColor = teamColor;
        }

        public String getLogoUrl() {
            return logoUrl;
        }

        public void setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
        }

        public String getBackgroundImageUrl() {
            return backgroundImageUrl;
        }

        public void setBackgroundImageUrl(String backgroundImageUrl) {
            this.backgroundImageUrl = backgroundImageUrl;
        }

        public String getTeambadgeImageUrl() {
            return teambadgeImageUrl;
        }

        public void setTeambadgeImageUrl(String teambadgeImageUrl) {
            this.teambadgeImageUrl = teambadgeImageUrl;
        }

        public Boolean getIsHomeTeam() {
            return isHomeTeam;
        }

        public void setIsHomeTeam(Boolean isHomeTeam) {
            this.isHomeTeam = isHomeTeam;
        }

        public Boolean getIsTossWinner() {
            return isTossWinner;
        }

        public void setIsTossWinner(Boolean isTossWinner) {
            this.isTossWinner = isTossWinner;
        }

        public Boolean getIsMatchWinner() {
            return isMatchWinner;
        }

        public void setIsMatchWinner(Boolean isMatchWinner) {
            this.isMatchWinner = isMatchWinner;
        }

        public Integer getBattingBonus() {
            return battingBonus;
        }

        public void setBattingBonus(Integer battingBonus) {
            this.battingBonus = battingBonus;
        }

        public Integer getBowlingBonus() {
            return bowlingBonus;
        }

        public void setBowlingBonus(Integer bowlingBonus) {
            this.bowlingBonus = bowlingBonus;
        }

        public Boolean getIsActive() {
            return isActive;
        }

        public void setIsActive(Boolean isActive) {
            this.isActive = isActive;
        }

    }
    public class Inning {

        @SerializedName("Id")
        @Expose
        private Integer id;
        @SerializedName("FixtureId")
        @Expose
        private Integer fixtureId;
        @SerializedName("InningNumber")
        @Expose
        private Integer inningNumber;
        @SerializedName("BattingTeamId")
        @Expose
        private Integer battingTeamId;
        @SerializedName("Batsmen")
        @Expose
        private List<Batsman> batsmen = null;
        @SerializedName("BowlingTeamId")
        @Expose
        private Integer bowlingTeamId;
        @SerializedName("Bowlers")
        @Expose
        private List<Bowler> bowlers = null;
        @SerializedName("Wickets")
        @Expose
        private List<Wicket> wickets = null;
        @SerializedName("Overs")
        @Expose
        private List<Object> overs = null;
        @SerializedName("IsDeclared")
        @Expose
        private Boolean isDeclared;
        @SerializedName("IsFollowOn")
        @Expose
        private Boolean isFollowOn;
        @SerializedName("IsForfeited")
        @Expose
        private Boolean isForfeited;
        @SerializedName("OvernightRuns")
        @Expose
        private Integer overnightRuns;
        @SerializedName("OvernightWickets")
        @Expose
        private Integer overnightWickets;
        @SerializedName("ByesRuns")
        @Expose
        private Integer byesRuns;
        @SerializedName("LegByesRuns")
        @Expose
        private Integer legByesRuns;
        @SerializedName("NoBalls")
        @Expose
        private Integer noBalls;
        @SerializedName("Penalties")
        @Expose
        private Integer penalties;
        @SerializedName("TotalExtras")
        @Expose
        private Integer totalExtras;
        @SerializedName("WideBalls")
        @Expose
        private Integer wideBalls;
        @SerializedName("OversBowled")
        @Expose
        private String oversBowled;
        @SerializedName("RunsScored")
        @Expose
        private Integer runsScored;
        @SerializedName("NumberOfWicketsFallen")
        @Expose
        private Integer numberOfWicketsFallen;
        @SerializedName("Day")
        @Expose
        private Integer day;
        @SerializedName("DuckworthLewisOvers")
        @Expose
        private String duckworthLewisOvers;
        @SerializedName("Partnership")
        @Expose
        private Partnership partnership;
        @SerializedName("RequiredRunRate")
        @Expose
        private Double requiredRunRate;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getFixtureId() {
            return fixtureId;
        }

        public void setFixtureId(Integer fixtureId) {
            this.fixtureId = fixtureId;
        }

        public Integer getInningNumber() {
            return inningNumber;
        }

        public void setInningNumber(Integer inningNumber) {
            this.inningNumber = inningNumber;
        }

        public Integer getBattingTeamId() {
            return battingTeamId;
        }

        public void setBattingTeamId(Integer battingTeamId) {
            this.battingTeamId = battingTeamId;
        }

        public List<Batsman> getBatsmen() {
            return batsmen;
        }

        public void setBatsmen(List<Batsman> batsmen) {
            this.batsmen = batsmen;
        }

        public Integer getBowlingTeamId() {
            return bowlingTeamId;
        }

        public void setBowlingTeamId(Integer bowlingTeamId) {
            this.bowlingTeamId = bowlingTeamId;
        }

        public List<Bowler> getBowlers() {
            return bowlers;
        }

        public void setBowlers(List<Bowler> bowlers) {
            this.bowlers = bowlers;
        }

        public List<Wicket> getWickets() {
            return wickets;
        }

        public void setWickets(List<Wicket> wickets) {
            this.wickets = wickets;
        }

        public List<Object> getOvers() {
            return overs;
        }

        public void setOvers(List<Object> overs) {
            this.overs = overs;
        }

        public Boolean getIsDeclared() {
            return isDeclared;
        }

        public void setIsDeclared(Boolean isDeclared) {
            this.isDeclared = isDeclared;
        }

        public Boolean getIsFollowOn() {
            return isFollowOn;
        }

        public void setIsFollowOn(Boolean isFollowOn) {
            this.isFollowOn = isFollowOn;
        }

        public Boolean getIsForfeited() {
            return isForfeited;
        }

        public void setIsForfeited(Boolean isForfeited) {
            this.isForfeited = isForfeited;
        }

        public Integer getOvernightRuns() {
            return overnightRuns;
        }

        public void setOvernightRuns(Integer overnightRuns) {
            this.overnightRuns = overnightRuns;
        }

        public Integer getOvernightWickets() {
            return overnightWickets;
        }

        public void setOvernightWickets(Integer overnightWickets) {
            this.overnightWickets = overnightWickets;
        }

        public Integer getByesRuns() {
            return byesRuns;
        }

        public void setByesRuns(Integer byesRuns) {
            this.byesRuns = byesRuns;
        }

        public Integer getLegByesRuns() {
            return legByesRuns;
        }

        public void setLegByesRuns(Integer legByesRuns) {
            this.legByesRuns = legByesRuns;
        }

        public Integer getNoBalls() {
            return noBalls;
        }

        public void setNoBalls(Integer noBalls) {
            this.noBalls = noBalls;
        }

        public Integer getPenalties() {
            return penalties;
        }

        public void setPenalties(Integer penalties) {
            this.penalties = penalties;
        }

        public Integer getTotalExtras() {
            return totalExtras;
        }

        public void setTotalExtras(Integer totalExtras) {
            this.totalExtras = totalExtras;
        }

        public Integer getWideBalls() {
            return wideBalls;
        }

        public void setWideBalls(Integer wideBalls) {
            this.wideBalls = wideBalls;
        }

        public String getOversBowled() {
            return oversBowled;
        }

        public void setOversBowled(String oversBowled) {
            this.oversBowled = oversBowled;
        }

        public Integer getRunsScored() {
            return runsScored;
        }

        public void setRunsScored(Integer runsScored) {
            this.runsScored = runsScored;
        }

        public Integer getNumberOfWicketsFallen() {
            return numberOfWicketsFallen;
        }

        public void setNumberOfWicketsFallen(Integer numberOfWicketsFallen) {
            this.numberOfWicketsFallen = numberOfWicketsFallen;
        }

        public Integer getDay() {
            return day;
        }

        public void setDay(Integer day) {
            this.day = day;
        }

        public String getDuckworthLewisOvers() {
            return duckworthLewisOvers;
        }

        public void setDuckworthLewisOvers(String duckworthLewisOvers) {
            this.duckworthLewisOvers = duckworthLewisOvers;
        }

        public Partnership getPartnership() {
            return partnership;
        }

        public void setPartnership(Partnership partnership) {
            this.partnership = partnership;
        }

        public Double getRequiredRunRate() {
            return requiredRunRate;
        }

        public void setRequiredRunRate(Double requiredRunRate) {
            this.requiredRunRate = requiredRunRate;
        }

    }
    public class Official {

        @SerializedName("FirstName")
        @Expose
        private String firstName;
        @SerializedName("LastName")
        @Expose
        private String lastName;
        @SerializedName("Initials")
        @Expose
        private String initials;
        @SerializedName("UmpireType")
        @Expose
        private String umpireType;
        @SerializedName("HasRetired")
        @Expose
        private Boolean hasRetired;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getInitials() {
            return initials;
        }

        public void setInitials(String initials) {
            this.initials = initials;
        }

        public String getUmpireType() {
            return umpireType;
        }

        public void setUmpireType(String umpireType) {
            this.umpireType = umpireType;
        }

        public Boolean getHasRetired() {
            return hasRetired;
        }

        public void setHasRetired(Boolean hasRetired) {
            this.hasRetired = hasRetired;
        }

    }
    public class Partnership {

        @SerializedName("FirstPlayerId")
        @Expose
        private Integer firstPlayerId;
        @SerializedName("FirstPlayerBallsFaced")
        @Expose
        private Integer firstPlayerBallsFaced;
        @SerializedName("FirstPlayerRunsScored")
        @Expose
        private Integer firstPlayerRunsScored;
        @SerializedName("FirstPlayerIsOnStrike")
        @Expose
        private Boolean firstPlayerIsOnStrike;
        @SerializedName("SecondPlayerId")
        @Expose
        private Integer secondPlayerId;
        @SerializedName("SecondPlayerBallsFaced")
        @Expose
        private Integer secondPlayerBallsFaced;
        @SerializedName("SecondPlayerRunsScored")
        @Expose
        private Integer secondPlayerRunsScored;
        @SerializedName("SecondPlayerIsOnStrike")
        @Expose
        private Boolean secondPlayerIsOnStrike;
        @SerializedName("TotalRunsScored")
        @Expose
        private Integer totalRunsScored;
        @SerializedName("IsCurrent")
        @Expose
        private Boolean isCurrent;
        @SerializedName("Runrate")
        @Expose
        private Integer runrate;
        @SerializedName("TotalBallsFaced")
        @Expose
        private Integer totalBallsFaced;

        public Integer getFirstPlayerId() {
            return firstPlayerId;
        }

        public void setFirstPlayerId(Integer firstPlayerId) {
            this.firstPlayerId = firstPlayerId;
        }

        public Integer getFirstPlayerBallsFaced() {
            return firstPlayerBallsFaced;
        }

        public void setFirstPlayerBallsFaced(Integer firstPlayerBallsFaced) {
            this.firstPlayerBallsFaced = firstPlayerBallsFaced;
        }

        public Integer getFirstPlayerRunsScored() {
            return firstPlayerRunsScored;
        }

        public void setFirstPlayerRunsScored(Integer firstPlayerRunsScored) {
            this.firstPlayerRunsScored = firstPlayerRunsScored;
        }

        public Boolean getFirstPlayerIsOnStrike() {
            return firstPlayerIsOnStrike;
        }

        public void setFirstPlayerIsOnStrike(Boolean firstPlayerIsOnStrike) {
            this.firstPlayerIsOnStrike = firstPlayerIsOnStrike;
        }

        public Integer getSecondPlayerId() {
            return secondPlayerId;
        }

        public void setSecondPlayerId(Integer secondPlayerId) {
            this.secondPlayerId = secondPlayerId;
        }

        public Integer getSecondPlayerBallsFaced() {
            return secondPlayerBallsFaced;
        }

        public void setSecondPlayerBallsFaced(Integer secondPlayerBallsFaced) {
            this.secondPlayerBallsFaced = secondPlayerBallsFaced;
        }

        public Integer getSecondPlayerRunsScored() {
            return secondPlayerRunsScored;
        }

        public void setSecondPlayerRunsScored(Integer secondPlayerRunsScored) {
            this.secondPlayerRunsScored = secondPlayerRunsScored;
        }

        public Boolean getSecondPlayerIsOnStrike() {
            return secondPlayerIsOnStrike;
        }

        public void setSecondPlayerIsOnStrike(Boolean secondPlayerIsOnStrike) {
            this.secondPlayerIsOnStrike = secondPlayerIsOnStrike;
        }

        public Integer getTotalRunsScored() {
            return totalRunsScored;
        }

        public void setTotalRunsScored(Integer totalRunsScored) {
            this.totalRunsScored = totalRunsScored;
        }

        public Boolean getIsCurrent() {
            return isCurrent;
        }

        public void setIsCurrent(Boolean isCurrent) {
            this.isCurrent = isCurrent;
        }

        public Integer getRunrate() {
            return runrate;
        }

        public void setRunrate(Integer runrate) {
            this.runrate = runrate;
        }

        public Integer getTotalBallsFaced() {
            return totalBallsFaced;
        }

        public void setTotalBallsFaced(Integer totalBallsFaced) {
            this.totalBallsFaced = totalBallsFaced;
        }

    }
    public class Venue {

        @SerializedName("Id")
        @Expose
        private Integer id;
        @SerializedName("Name")
        @Expose
        private String name;
        @SerializedName("City")
        @Expose
        private String city;
        @SerializedName("ImageUrl")
        @Expose
        private String imageUrl;
        @SerializedName("Latitude")
        @Expose
        private String latitude;
        @SerializedName("Longitude")
        @Expose
        private String longitude;
        @SerializedName("PhoneNumber")
        @Expose
        private String phoneNumber;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

    }
    public class Wicket {

        @SerializedName("PlayerId")
        @Expose
        private Integer playerId;
        @SerializedName("Order")
        @Expose
        private Integer order;
        @SerializedName("OverBallDisplay")
        @Expose
        private String overBallDisplay;
        @SerializedName("Runs")
        @Expose
        private Integer runs;
        @SerializedName("InningsBallId")
        @Expose
        private Integer inningsBallId;

        public Integer getPlayerId() {
            return playerId;
        }

        public void setPlayerId(Integer playerId) {
            this.playerId = playerId;
        }

        public Integer getOrder() {
            return order;
        }

        public void setOrder(Integer order) {
            this.order = order;
        }

        public String getOverBallDisplay() {
            return overBallDisplay;
        }

        public void setOverBallDisplay(String overBallDisplay) {
            this.overBallDisplay = overBallDisplay;
        }

        public Integer getRuns() {
            return runs;
        }

        public void setRuns(Integer runs) {
            this.runs = runs;
        }

        public Integer getInningsBallId() {
            return inningsBallId;
        }

        public void setInningsBallId(Integer inningsBallId) {
            this.inningsBallId = inningsBallId;
        }

    }


    public class Player {

        @SerializedName("Id")
        @Expose
        private Integer id;
        @SerializedName("TeamId")
        @Expose
        private Integer teamId;
        @SerializedName("IsCaptain")
        @Expose
        private Boolean isCaptain;
        @SerializedName("IsWicketKeeper")
        @Expose
        private Boolean isWicketKeeper;
        @SerializedName("IsTwelthMan")
        @Expose
        private Boolean isTwelthMan;
        @SerializedName("IsManOfTheMatch")
        @Expose
        private Boolean isManOfTheMatch;
        @SerializedName("IsManOfTheSeries")
        @Expose
        private Boolean isManOfTheSeries;
        @SerializedName("ManOfTheMatchOrder")
        @Expose
        private Integer manOfTheMatchOrder;
        @SerializedName("ManOfTheSeriesOrder")
        @Expose
        private Integer manOfTheSeriesOrder;
        @SerializedName("Order")
        @Expose
        private Integer order;
        @SerializedName("FirstName")
        @Expose
        private String firstName;
        @SerializedName("LastName")
        @Expose
        private String lastName;
        @SerializedName("MiddleName")
        @Expose
        private String middleName;
        @SerializedName("Initials")
        @Expose
        private String initials;
        @SerializedName("DisplayName")
        @Expose
        private String displayName;
        @SerializedName("Type")
        @Expose
        private String type;
        @SerializedName("BattingHandId")
        @Expose
        private String battingHandId;
        @SerializedName("BattingHand")
        @Expose
        private String battingHand;
        @SerializedName("DOB")
        @Expose
        private String dob;
        @SerializedName("BirthPlace")
        @Expose
        private String birthPlace;
        @SerializedName("ImageUrl")
        @Expose
        private String imageUrl;
        @SerializedName("Height")
        @Expose
        private String height;
        @SerializedName("DidyouKnow")
        @Expose
        private String didyouKnow;
        @SerializedName("Bio")
        @Expose
        private String bio;
        @SerializedName("PlayerDetails")
        @Expose
        private List<PlayerDetail> playerDetails = null;
        @SerializedName("IsActive")
        @Expose
        private Boolean isActive;
        @SerializedName("SitecoreShortGUID")
        @Expose
        private String sitecoreShortGUID;
        @SerializedName("BowlingHandId")
        @Expose
        private String bowlingHandId;
        @SerializedName("BowlingTypeId")
        @Expose
        private String bowlingTypeId;
        @SerializedName("BowlingHand")
        @Expose
        private String bowlingHand;
        @SerializedName("BowlingType")
        @Expose
        private String bowlingType;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getTeamId() {
            return teamId;
        }

        public void setTeamId(Integer teamId) {
            this.teamId = teamId;
        }

        public Boolean getIsCaptain() {
            return isCaptain;
        }

        public void setIsCaptain(Boolean isCaptain) {
            this.isCaptain = isCaptain;
        }

        public Boolean getIsWicketKeeper() {
            return isWicketKeeper;
        }

        public void setIsWicketKeeper(Boolean isWicketKeeper) {
            this.isWicketKeeper = isWicketKeeper;
        }

        public Boolean getIsTwelthMan() {
            return isTwelthMan;
        }

        public void setIsTwelthMan(Boolean isTwelthMan) {
            this.isTwelthMan = isTwelthMan;
        }

        public Boolean getIsManOfTheMatch() {
            return isManOfTheMatch;
        }

        public void setIsManOfTheMatch(Boolean isManOfTheMatch) {
            this.isManOfTheMatch = isManOfTheMatch;
        }

        public Boolean getIsManOfTheSeries() {
            return isManOfTheSeries;
        }

        public void setIsManOfTheSeries(Boolean isManOfTheSeries) {
            this.isManOfTheSeries = isManOfTheSeries;
        }

        public Integer getManOfTheMatchOrder() {
            return manOfTheMatchOrder;
        }

        public void setManOfTheMatchOrder(Integer manOfTheMatchOrder) {
            this.manOfTheMatchOrder = manOfTheMatchOrder;
        }

        public Integer getManOfTheSeriesOrder() {
            return manOfTheSeriesOrder;
        }

        public void setManOfTheSeriesOrder(Integer manOfTheSeriesOrder) {
            this.manOfTheSeriesOrder = manOfTheSeriesOrder;
        }

        public Integer getOrder() {
            return order;
        }

        public void setOrder(Integer order) {
            this.order = order;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public String getInitials() {
            return initials;
        }

        public void setInitials(String initials) {
            this.initials = initials;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getBattingHandId() {
            return battingHandId;
        }

        public void setBattingHandId(String battingHandId) {
            this.battingHandId = battingHandId;
        }

        public String getBattingHand() {
            return battingHand;
        }

        public void setBattingHand(String battingHand) {
            this.battingHand = battingHand;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public String getBirthPlace() {
            return birthPlace;
        }

        public void setBirthPlace(String birthPlace) {
            this.birthPlace = birthPlace;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getDidyouKnow() {
            return didyouKnow;
        }

        public void setDidyouKnow(String didyouKnow) {
            this.didyouKnow = didyouKnow;
        }

        public String getBio() {
            return bio;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }

        public List<PlayerDetail> getPlayerDetails() {
            return playerDetails;
        }

        public void setPlayerDetails(List<PlayerDetail> playerDetails) {
            this.playerDetails = playerDetails;
        }

        public Boolean getIsActive() {
            return isActive;
        }

        public void setIsActive(Boolean isActive) {
            this.isActive = isActive;
        }

        public String getSitecoreShortGUID() {
            return sitecoreShortGUID;
        }

        public void setSitecoreShortGUID(String sitecoreShortGUID) {
            this.sitecoreShortGUID = sitecoreShortGUID;
        }

        public String getBowlingHandId() {
            return bowlingHandId;
        }

        public void setBowlingHandId(String bowlingHandId) {
            this.bowlingHandId = bowlingHandId;
        }

        public String getBowlingTypeId() {
            return bowlingTypeId;
        }

        public void setBowlingTypeId(String bowlingTypeId) {
            this.bowlingTypeId = bowlingTypeId;
        }

        public String getBowlingHand() {
            return bowlingHand;
        }

        public void setBowlingHand(String bowlingHand) {
            this.bowlingHand = bowlingHand;
        }

        public String getBowlingType() {
            return bowlingType;
        }

        public void setBowlingType(String bowlingType) {
            this.bowlingType = bowlingType;
        }

    }
    public class PlayerDetail {

        @SerializedName("PlayerId")
        @Expose
        private Integer playerId;
        @SerializedName("GameTypeId")
        @Expose
        private String gameTypeId;
        @SerializedName("GameType")
        @Expose
        private String gameType;
        @SerializedName("DebutDate")
        @Expose
        private String debutDate;
        @SerializedName("ImageUrl")
        @Expose
        private String imageUrl;

        public Integer getPlayerId() {
            return playerId;
        }

        public void setPlayerId(Integer playerId) {
            this.playerId = playerId;
        }

        public String getGameTypeId() {
            return gameTypeId;
        }

        public void setGameTypeId(String gameTypeId) {
            this.gameTypeId = gameTypeId;
        }

        public String getGameType() {
            return gameType;
        }

        public void setGameType(String gameType) {
            this.gameType = gameType;
        }

        public String getDebutDate() {
            return debutDate;
        }

        public void setDebutDate(String debutDate) {
            this.debutDate = debutDate;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

    }

}
