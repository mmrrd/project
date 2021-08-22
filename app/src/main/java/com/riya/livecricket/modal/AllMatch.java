package com.riya.livecricket.modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllMatch {

    @SerializedName("UpcomingFixtures")
    @Expose
    private List<UpcomingFixture> upcomingFixtures = null;

    public List<UpcomingFixture> getUpcomingFixtures() {
        return upcomingFixtures;
    }

    public void setUpcomingFixtures(List<UpcomingFixture> upcomingFixtures) {
        this.upcomingFixtures = upcomingFixtures;
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
        private Double battingBonus;
        @SerializedName("BowlingBonus")
        @Expose
        private Double bowlingBonus;
        @SerializedName("IsActive")
        @Expose
        private Boolean isActive;
        @SerializedName("LegacyTeamId")
        @Expose
        private Integer legacyTeamId;
        @SerializedName("FixtureId")
        @Expose
        private Integer fixtureId;

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

        public Double getBattingBonus() {
            return battingBonus;
        }

        public void setBattingBonus(Double battingBonus) {
            this.battingBonus = battingBonus;
        }

        public Double getBowlingBonus() {
            return bowlingBonus;
        }

        public void setBowlingBonus(Double bowlingBonus) {
            this.bowlingBonus = bowlingBonus;
        }

        public Boolean getIsActive() {
            return isActive;
        }

        public void setIsActive(Boolean isActive) {
            this.isActive = isActive;
        }

        public Integer getLegacyTeamId() {
            return legacyTeamId;
        }

        public void setLegacyTeamId(Integer legacyTeamId) {
            this.legacyTeamId = legacyTeamId;
        }

        public Integer getFixtureId() {
            return fixtureId;
        }

        public void setFixtureId(Integer fixtureId) {
            this.fixtureId = fixtureId;
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
        private Double battingBonus;
        @SerializedName("BowlingBonus")
        @Expose
        private Double bowlingBonus;
        @SerializedName("IsActive")
        @Expose
        private Boolean isActive;
        @SerializedName("LegacyTeamId")
        @Expose
        private Integer legacyTeamId;
        @SerializedName("FixtureId")
        @Expose
        private Integer fixtureId;

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

        public Double getBattingBonus() {
            return battingBonus;
        }

        public void setBattingBonus(Double battingBonus) {
            this.battingBonus = battingBonus;
        }

        public Double getBowlingBonus() {
            return bowlingBonus;
        }

        public void setBowlingBonus(Double bowlingBonus) {
            this.bowlingBonus = bowlingBonus;
        }

        public Boolean getIsActive() {
            return isActive;
        }

        public void setIsActive(Boolean isActive) {
            this.isActive = isActive;
        }

        public Integer getLegacyTeamId() {
            return legacyTeamId;
        }

        public void setLegacyTeamId(Integer legacyTeamId) {
            this.legacyTeamId = legacyTeamId;
        }

        public Integer getFixtureId() {
            return fixtureId;
        }

        public void setFixtureId(Integer fixtureId) {
            this.fixtureId = fixtureId;
        }

    }
    public class UpcomingFixture {

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
        private List<Object> innings = null;
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
        @SerializedName("LegacyFixtureId")
        @Expose
        private Integer legacyFixtureId;
        @SerializedName("IsInProgress")
        @Expose
        private Boolean isInProgress;
        @SerializedName("TotalOvers")
        @Expose
        private String totalOvers;
        @SerializedName("TotalBalls")
        @Expose
        private Integer totalBalls;
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

        public List<Object> getInnings() {
            return innings;
        }

        public void setInnings(List<Object> innings) {
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

        public Integer getTotalBalls() {
            return totalBalls;
        }

        public void setTotalBalls(Integer totalBalls) {
            this.totalBalls = totalBalls;
        }

        public Boolean getIsPublished() {
            return isPublished;
        }

        public void setIsPublished(Boolean isPublished) {
            this.isPublished = isPublished;
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




    @SerializedName("InProgressFixtures")
    @Expose
    private List<InProgressFixture> inProgressFixtures = null;

    public List<InProgressFixture> getInProgressFixtures() {
        return inProgressFixtures;
    }

    public void setInProgressFixtures(List<InProgressFixture> inProgressFixtures) {
        this.inProgressFixtures = inProgressFixtures;
    }

    public class AwayTeam1 {

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
        @SerializedName("FixtureId")
        @Expose
        private Integer fixtureId;

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

        public Integer getFixtureId() {
            return fixtureId;
        }

        public void setFixtureId(Integer fixtureId) {
            this.fixtureId = fixtureId;
        }

    }
    public class Competition1 {

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
        private List<Format1> formats = null;
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

        public List<Format1> getFormats() {
            return formats;
        }

        public void setFormats(List<Format1> formats) {
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
    public class Format1 {

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
    public class HomeTeam1 {

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
        @SerializedName("FixtureId")
        @Expose
        private Integer fixtureId;

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

        public Integer getFixtureId() {
            return fixtureId;
        }

        public void setFixtureId(Integer fixtureId) {
            this.fixtureId = fixtureId;
        }

    }
    public class InProgressFixture {

        @SerializedName("Competition")
        @Expose
        private Competition1 competition;
        @SerializedName("HomeTeam")
        @Expose
        private HomeTeam1 homeTeam;
        @SerializedName("AwayTeam")
        @Expose
        private AwayTeam1 awayTeam;
        @SerializedName("Venue")
        @Expose
        private Venue1 venue;
        @SerializedName("Innings")
        @Expose
        private List<Inning1> innings = null;
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
        @SerializedName("LegacyFixtureId")
        @Expose
        private Integer legacyFixtureId;
        @SerializedName("IsInProgress")
        @Expose
        private Boolean isInProgress;
        @SerializedName("TotalOvers")
        @Expose
        private String totalOvers;
        @SerializedName("TotalBalls")
        @Expose
        private Integer totalBalls;
        @SerializedName("IsPublished")
        @Expose
        private Boolean isPublished;

        public Competition1 getCompetition() {
            return competition;
        }

        public void setCompetition(Competition1 competition) {
            this.competition = competition;
        }

        public HomeTeam1 getHomeTeam() {
            return homeTeam;
        }

        public void setHomeTeam(HomeTeam1 homeTeam) {
            this.homeTeam = homeTeam;
        }

        public AwayTeam1 getAwayTeam() {
            return awayTeam;
        }

        public void setAwayTeam(AwayTeam1 awayTeam) {
            this.awayTeam = awayTeam;
        }

        public Venue1 getVenue() {
            return venue;
        }

        public void setVenue(Venue1 venue) {
            this.venue = venue;
        }

        public List<Inning1> getInnings() {
            return innings;
        }

        public void setInnings(List<Inning1> innings) {
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

        public Integer getTotalBalls() {
            return totalBalls;
        }

        public void setTotalBalls(Integer totalBalls) {
            this.totalBalls = totalBalls;
        }

        public Boolean getIsPublished() {
            return isPublished;
        }

        public void setIsPublished(Boolean isPublished) {
            this.isPublished = isPublished;
        }

    }
    public class Inning1 {

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
        @SerializedName("BowlingTeamId")
        @Expose
        private Integer bowlingTeamId;
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
        @SerializedName("Balls")
        @Expose
        private Integer balls;
        @SerializedName("BallsRemaining")
        @Expose
        private Integer ballsRemaining;
        @SerializedName("RunsScored")
        @Expose
        private Integer runsScored;
        @SerializedName("CurrentRunRate")
        @Expose
        private Double currentRunRate;
        @SerializedName("NumberOfWicketsFallen")
        @Expose
        private Integer numberOfWicketsFallen;
        @SerializedName("Day")
        @Expose
        private Integer day;
        @SerializedName("DuckworthLewisOvers")
        @Expose
        private String duckworthLewisOvers;
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

        public Integer getBowlingTeamId() {
            return bowlingTeamId;
        }

        public void setBowlingTeamId(Integer bowlingTeamId) {
            this.bowlingTeamId = bowlingTeamId;
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

        public Integer getBalls() {
            return balls;
        }

        public void setBalls(Integer balls) {
            this.balls = balls;
        }

        public Integer getBallsRemaining() {
            return ballsRemaining;
        }

        public void setBallsRemaining(Integer ballsRemaining) {
            this.ballsRemaining = ballsRemaining;
        }

        public Integer getRunsScored() {
            return runsScored;
        }

        public void setRunsScored(Integer runsScored) {
            this.runsScored = runsScored;
        }

        public Double getCurrentRunRate() {
            return currentRunRate;
        }

        public void setCurrentRunRate(Double currentRunRate) {
            this.currentRunRate = currentRunRate;
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

        public Double getRequiredRunRate() {
            return requiredRunRate;
        }

        public void setRequiredRunRate(Double requiredRunRate) {
            this.requiredRunRate = requiredRunRate;
        }

    }
    public class Venue1 {

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


    @SerializedName("CompletedFixtures")
    @Expose
    private List<CompletedFixture> completedFixtures = null;
    @SerializedName("ResponseError")
    @Expose
    private Boolean responseError;

    public List<CompletedFixture> getCompletedFixtures() {
        return completedFixtures;
    }

    public void setCompletedFixtures(List<CompletedFixture> completedFixtures) {
        this.completedFixtures = completedFixtures;
    }

    public Boolean getResponseError() {
        return responseError;
    }

    public void setResponseError(Boolean responseError) {
        this.responseError = responseError;
    }

    public class AwayTeam2 {

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
        @SerializedName("FixtureId")
        @Expose
        private Integer fixtureId;

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

        public Integer getFixtureId() {
            return fixtureId;
        }

        public void setFixtureId(Integer fixtureId) {
            this.fixtureId = fixtureId;
        }

    }
    public class Competition2 {

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
        private List<Format2> formats = null;
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

        public List<Format2> getFormats() {
            return formats;
        }

        public void setFormats(List<Format2> formats) {
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
    public class CompletedFixture {

        @SerializedName("Competition")
        @Expose
        private Competition2 competition;
        @SerializedName("HomeTeam")
        @Expose
        private HomeTeam2 homeTeam;
        @SerializedName("AwayTeam")
        @Expose
        private AwayTeam2 awayTeam;
        @SerializedName("Venue")
        @Expose
        private Venue2 venue;
        @SerializedName("Innings")
        @Expose
        private List<Inning2> innings = null;
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
        @SerializedName("LegacyFixtureId")
        @Expose
        private Integer legacyFixtureId;
        @SerializedName("IsInProgress")
        @Expose
        private Boolean isInProgress;
        @SerializedName("TotalOvers")
        @Expose
        private String totalOvers;
        @SerializedName("TotalBalls")
        @Expose
        private Integer totalBalls;
        @SerializedName("IsPublished")
        @Expose
        private Boolean isPublished;

        public Competition2 getCompetition() {
            return competition;
        }

        public void setCompetition(Competition2 competition) {
            this.competition = competition;
        }

        public HomeTeam2 getHomeTeam() {
            return homeTeam;
        }

        public void setHomeTeam(HomeTeam2 homeTeam) {
            this.homeTeam = homeTeam;
        }

        public AwayTeam2 getAwayTeam() {
            return awayTeam;
        }

        public void setAwayTeam(AwayTeam2 awayTeam) {
            this.awayTeam = awayTeam;
        }

        public Venue2 getVenue() {
            return venue;
        }

        public void setVenue(Venue2 venue) {
            this.venue = venue;
        }

        public List<Inning2> getInnings() {
            return innings;
        }

        public void setInnings(List<Inning2> innings) {
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

        public Integer getTotalBalls() {
            return totalBalls;
        }

        public void setTotalBalls(Integer totalBalls) {
            this.totalBalls = totalBalls;
        }

        public Boolean getIsPublished() {
            return isPublished;
        }

        public void setIsPublished(Boolean isPublished) {
            this.isPublished = isPublished;
        }

    }
    public class Format2 {

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
    public class HomeTeam2 {

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
        @SerializedName("FixtureId")
        @Expose
        private Integer fixtureId;

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

        public Integer getFixtureId() {
            return fixtureId;
        }

        public void setFixtureId(Integer fixtureId) {
            this.fixtureId = fixtureId;
        }

    }
    public class Inning2 {

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
        @SerializedName("BowlingTeamId")
        @Expose
        private Integer bowlingTeamId;
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
        @SerializedName("Balls")
        @Expose
        private Integer balls;
        @SerializedName("BallsRemaining")
        @Expose
        private Integer ballsRemaining;
        @SerializedName("RunsScored")
        @Expose
        private Integer runsScored;
        @SerializedName("CurrentRunRate")
        @Expose
        private Double currentRunRate;
        @SerializedName("NumberOfWicketsFallen")
        @Expose
        private Integer numberOfWicketsFallen;
        @SerializedName("Day")
        @Expose
        private Integer day;
        @SerializedName("DuckworthLewisOvers")
        @Expose
        private String duckworthLewisOvers;
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

        public Integer getBowlingTeamId() {
            return bowlingTeamId;
        }

        public void setBowlingTeamId(Integer bowlingTeamId) {
            this.bowlingTeamId = bowlingTeamId;
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

        public Integer getBalls() {
            return balls;
        }

        public void setBalls(Integer balls) {
            this.balls = balls;
        }

        public Integer getBallsRemaining() {
            return ballsRemaining;
        }

        public void setBallsRemaining(Integer ballsRemaining) {
            this.ballsRemaining = ballsRemaining;
        }

        public Integer getRunsScored() {
            return runsScored;
        }

        public void setRunsScored(Integer runsScored) {
            this.runsScored = runsScored;
        }

        public Double getCurrentRunRate() {
            return currentRunRate;
        }

        public void setCurrentRunRate(Double currentRunRate) {
            this.currentRunRate = currentRunRate;
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

        public Double getRequiredRunRate() {
            return requiredRunRate;
        }

        public void setRequiredRunRate(Double requiredRunRate) {
            this.requiredRunRate = requiredRunRate;
        }

    }
    public class Venue2 {

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

}
