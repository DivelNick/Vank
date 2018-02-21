package divelnick.ru.vank.data.network.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User {

    @SerializedName("response")
    @Expose
    private List<Response> response = null;

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

    public class City {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("title")
        @Expose
        private String title;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

    }


    public class Country {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("title")
        @Expose
        private String title;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

    }


    public class Crop {

        @SerializedName("x")
        @Expose
        private Double x;
        @SerializedName("y")
        @Expose
        private Double y;
        @SerializedName("x2")
        @Expose
        private Double x2;
        @SerializedName("y2")
        @Expose
        private Double y2;

        public Double getX() {
            return x;
        }

        public void setX(Double x) {
            this.x = x;
        }

        public Double getY() {
            return y;
        }

        public void setY(Double y) {
            this.y = y;
        }

        public Double getX2() {
            return x2;
        }

        public void setX2(Double x2) {
            this.x2 = x2;
        }

        public Double getY2() {
            return y2;
        }

        public void setY2(Double y2) {
            this.y2 = y2;
        }
    }


    public class CropPhoto {

        @SerializedName("photo")
        @Expose
        private Photo photo;
        @SerializedName("crop")
        @Expose
        private Crop crop;
        @SerializedName("rect")
        @Expose
        private Rect rect;

        public Photo getPhoto() {
            return photo;
        }

        public void setPhoto(Photo photo) {
            this.photo = photo;
        }

        public Crop getCrop() {
            return crop;
        }

        public void setCrop(Crop crop) {
            this.crop = crop;
        }

        public Rect getRect() {
            return rect;
        }

        public void setRect(Rect rect) {
            this.rect = rect;
        }

    }


    public class LastSeen {

        @SerializedName("time")
        @Expose
        private Integer time;
        @SerializedName("platform")
        @Expose
        private Integer platform;

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }

        public Integer getPlatform() {
            return platform;
        }

        public void setPlatform(Integer platform) {
            this.platform = platform;
        }

    }


    public class Occupation {

        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
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

    }


    public class Personal {

        @SerializedName("political")
        @Expose
        private Integer political;

        public Integer getPolitical() {
            return political;
        }

        public void setPolitical(Integer political) {
            this.political = political;
        }

    }


    public class Photo {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("album_id")
        @Expose
        private Integer albumId;
        @SerializedName("owner_id")
        @Expose
        private Integer ownerId;
        @SerializedName("photo_75")
        @Expose
        private String photo75;
        @SerializedName("photo_130")
        @Expose
        private String photo130;
        @SerializedName("photo_604")
        @Expose
        private String photo604;
        @SerializedName("photo_807")
        @Expose
        private String photo807;
        @SerializedName("photo_1280")
        @Expose
        private String photo1280;
        @SerializedName("photo_2560")
        @Expose
        private String photo2560;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("text")
        @Expose
        private String text;
        @SerializedName("date")
        @Expose
        private Integer date;
        @SerializedName("post_id")
        @Expose
        private Integer postId;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getAlbumId() {
            return albumId;
        }

        public void setAlbumId(Integer albumId) {
            this.albumId = albumId;
        }

        public Integer getOwnerId() {
            return ownerId;
        }

        public void setOwnerId(Integer ownerId) {
            this.ownerId = ownerId;
        }

        public String getPhoto75() {
            return photo75;
        }

        public void setPhoto75(String photo75) {
            this.photo75 = photo75;
        }

        public String getPhoto130() {
            return photo130;
        }

        public void setPhoto130(String photo130) {
            this.photo130 = photo130;
        }

        public String getPhoto604() {
            return photo604;
        }

        public void setPhoto604(String photo604) {
            this.photo604 = photo604;
        }

        public String getPhoto807() {
            return photo807;
        }

        public void setPhoto807(String photo807) {
            this.photo807 = photo807;
        }

        public String getPhoto1280() {
            return photo1280;
        }

        public void setPhoto1280(String photo1280) {
            this.photo1280 = photo1280;
        }

        public String getPhoto2560() {
            return photo2560;
        }

        public void setPhoto2560(String photo2560) {
            this.photo2560 = photo2560;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public Integer getDate() {
            return date;
        }

        public void setDate(Integer date) {
            this.date = date;
        }

        public Integer getPostId() {
            return postId;
        }

        public void setPostId(Integer postId) {
            this.postId = postId;
        }

    }


    public class Rect {

        @SerializedName("x")
        @Expose
        private Integer x;
        @SerializedName("y")
        @Expose
        private Integer y;
        @SerializedName("x2")
        @Expose
        private Integer x2;
        @SerializedName("y2")
        @Expose
        private Integer y2;

        public Integer getX() {
            return x;
        }

        public void setX(Integer x) {
            this.x = x;
        }

        public Integer getY() {
            return y;
        }

        public void setY(Integer y) {
            this.y = y;
        }

        public Integer getX2() {
            return x2;
        }

        public void setX2(Integer x2) {
            this.x2 = x2;
        }

        public Integer getY2() {
            return y2;
        }

        public void setY2(Integer y2) {
            this.y2 = y2;
        }

    }


    public class Relative {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("type")
        @Expose
        private String type;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

    }


    public class Response {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("first_name")
        @Expose
        private String firstName;
        @SerializedName("last_name")
        @Expose
        private String lastName;
        @SerializedName("sex")
        @Expose
        private Integer sex;
        @SerializedName("nickname")
        @Expose
        private String nickname;
        @SerializedName("domain")
        @Expose
        private String domain;
        @SerializedName("screen_name")
        @Expose
        private String screenName;
        @SerializedName("bdate")
        @Expose
        private String bdate;
        @SerializedName("city")
        @Expose
        private City city;
        @SerializedName("country")
        @Expose
        private Country country;
        @SerializedName("photo_50")
        @Expose
        private String photo50;
        @SerializedName("photo_100")
        @Expose
        private String photo100;
        @SerializedName("photo_200")
        @Expose
        private String photo200;
        @SerializedName("photo_max")
        @Expose
        private String photoMax;
        @SerializedName("photo_200_orig")
        @Expose
        private String photo200Orig;
        @SerializedName("photo_400_orig")
        @Expose
        private String photo400Orig;
        @SerializedName("photo_max_orig")
        @Expose
        private String photoMaxOrig;
        @SerializedName("photo_id")
        @Expose
        private String photoId;
        @SerializedName("has_photo")
        @Expose
        private Integer hasPhoto;
        @SerializedName("has_mobile")
        @Expose
        private Integer hasMobile;
        @SerializedName("is_friend")
        @Expose
        private Integer isFriend;
        @SerializedName("friend_status")
        @Expose
        private Integer friendStatus;
        @SerializedName("online")
        @Expose
        private Integer online;
        @SerializedName("wall_comments")
        @Expose
        private Integer wallComments;
        @SerializedName("can_post")
        @Expose
        private Integer canPost;
        @SerializedName("can_see_all_posts")
        @Expose
        private Integer canSeeAllPosts;
        @SerializedName("can_see_audio")
        @Expose
        private Integer canSeeAudio;
        @SerializedName("can_write_private_message")
        @Expose
        private Integer canWritePrivateMessage;
        @SerializedName("can_send_friend_request")
        @Expose
        private Integer canSendFriendRequest;
        @SerializedName("mobile_phone")
        @Expose
        private String mobilePhone;
        @SerializedName("home_phone")
        @Expose
        private String homePhone;
        @SerializedName("site")
        @Expose
        private String site;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("last_seen")
        @Expose
        private LastSeen lastSeen;
        @SerializedName("crop_photo")
        @Expose
        private CropPhoto cropPhoto;
        @SerializedName("verified")
        @Expose
        private Integer verified;
        @SerializedName("followers_count")
        @Expose
        private Integer followersCount;
        @SerializedName("blacklisted")
        @Expose
        private Integer blacklisted;
        @SerializedName("blacklisted_by_me")
        @Expose
        private Integer blacklistedByMe;
        @SerializedName("is_favorite")
        @Expose
        private Integer isFavorite;
        @SerializedName("is_hidden_from_feed")
        @Expose
        private Integer isHiddenFromFeed;
        @SerializedName("common_count")
        @Expose
        private Integer commonCount;
        @SerializedName("occupation")
        @Expose
        private Occupation occupation;
        @SerializedName("career")
        @Expose
        private List<Object> career = null;
        @SerializedName("military")
        @Expose
        private List<Object> military = null;
        @SerializedName("university")
        @Expose
        private Integer university;
        @SerializedName("university_name")
        @Expose
        private String universityName;
        @SerializedName("faculty")
        @Expose
        private Integer faculty;
        @SerializedName("faculty_name")
        @Expose
        private String facultyName;
        @SerializedName("graduation")
        @Expose
        private Integer graduation;
        @SerializedName("home_town")
        @Expose
        private String homeTown;
        @SerializedName("relation")
        @Expose
        private Integer relation;
        @SerializedName("personal")
        @Expose
        private Personal personal;
        @SerializedName("interests")
        @Expose
        private String interests;
        @SerializedName("music")
        @Expose
        private String music;
        @SerializedName("activities")
        @Expose
        private String activities;
        @SerializedName("movies")
        @Expose
        private String movies;
        @SerializedName("tv")
        @Expose
        private String tv;
        @SerializedName("books")
        @Expose
        private String books;
        @SerializedName("games")
        @Expose
        private String games;
        @SerializedName("universities")
        @Expose
        private List<University> universities = null;
        @SerializedName("schools")
        @Expose
        private List<School> schools = null;
        @SerializedName("about")
        @Expose
        private String about;
        @SerializedName("relatives")
        @Expose
        private List<Relative> relatives = null;
        @SerializedName("quotes")
        @Expose
        private String quotes;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
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

        public Integer getSex() {
            return sex;
        }

        public void setSex(Integer sex) {
            this.sex = sex;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public String getScreenName() {
            return screenName;
        }

        public void setScreenName(String screenName) {
            this.screenName = screenName;
        }

        public String getBdate() {
            return bdate;
        }

        public void setBdate(String bdate) {
            this.bdate = bdate;
        }

        public City getCity() {
            return city;
        }

        public void setCity(City city) {
            this.city = city;
        }

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
        }

        public String getPhoto50() {
            return photo50;
        }

        public void setPhoto50(String photo50) {
            this.photo50 = photo50;
        }

        public String getPhoto100() {
            return photo100;
        }

        public void setPhoto100(String photo100) {
            this.photo100 = photo100;
        }

        public String getPhoto200() {
            return photo200;
        }

        public void setPhoto200(String photo200) {
            this.photo200 = photo200;
        }

        public String getPhotoMax() {
            return photoMax;
        }

        public void setPhotoMax(String photoMax) {
            this.photoMax = photoMax;
        }

        public String getPhoto200Orig() {
            return photo200Orig;
        }

        public void setPhoto200Orig(String photo200Orig) {
            this.photo200Orig = photo200Orig;
        }

        public String getPhoto400Orig() {
            return photo400Orig;
        }

        public void setPhoto400Orig(String photo400Orig) {
            this.photo400Orig = photo400Orig;
        }

        public String getPhotoMaxOrig() {
            return photoMaxOrig;
        }

        public void setPhotoMaxOrig(String photoMaxOrig) {
            this.photoMaxOrig = photoMaxOrig;
        }

        public String getPhotoId() {
            return photoId;
        }

        public void setPhotoId(String photoId) {
            this.photoId = photoId;
        }

        public Integer getHasPhoto() {
            return hasPhoto;
        }

        public void setHasPhoto(Integer hasPhoto) {
            this.hasPhoto = hasPhoto;
        }

        public Integer getHasMobile() {
            return hasMobile;
        }

        public void setHasMobile(Integer hasMobile) {
            this.hasMobile = hasMobile;
        }

        public Integer getIsFriend() {
            return isFriend;
        }

        public void setIsFriend(Integer isFriend) {
            this.isFriend = isFriend;
        }

        public Integer getFriendStatus() {
            return friendStatus;
        }

        public void setFriendStatus(Integer friendStatus) {
            this.friendStatus = friendStatus;
        }

        public Integer getOnline() {
            return online;
        }

        public void setOnline(Integer online) {
            this.online = online;
        }

        public Integer getWallComments() {
            return wallComments;
        }

        public void setWallComments(Integer wallComments) {
            this.wallComments = wallComments;
        }

        public Integer getCanPost() {
            return canPost;
        }

        public void setCanPost(Integer canPost) {
            this.canPost = canPost;
        }

        public Integer getCanSeeAllPosts() {
            return canSeeAllPosts;
        }

        public void setCanSeeAllPosts(Integer canSeeAllPosts) {
            this.canSeeAllPosts = canSeeAllPosts;
        }

        public Integer getCanSeeAudio() {
            return canSeeAudio;
        }

        public void setCanSeeAudio(Integer canSeeAudio) {
            this.canSeeAudio = canSeeAudio;
        }

        public Integer getCanWritePrivateMessage() {
            return canWritePrivateMessage;
        }

        public void setCanWritePrivateMessage(Integer canWritePrivateMessage) {
            this.canWritePrivateMessage = canWritePrivateMessage;
        }

        public Integer getCanSendFriendRequest() {
            return canSendFriendRequest;
        }

        public void setCanSendFriendRequest(Integer canSendFriendRequest) {
            this.canSendFriendRequest = canSendFriendRequest;
        }

        public String getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public String getHomePhone() {
            return homePhone;
        }

        public void setHomePhone(String homePhone) {
            this.homePhone = homePhone;
        }

        public String getSite() {
            return site;
        }

        public void setSite(String site) {
            this.site = site;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public LastSeen getLastSeen() {
            return lastSeen;
        }

        public void setLastSeen(LastSeen lastSeen) {
            this.lastSeen = lastSeen;
        }

        public CropPhoto getCropPhoto() {
            return cropPhoto;
        }

        public void setCropPhoto(CropPhoto cropPhoto) {
            this.cropPhoto = cropPhoto;
        }

        public Integer getVerified() {
            return verified;
        }

        public void setVerified(Integer verified) {
            this.verified = verified;
        }

        public Integer getFollowersCount() {
            return followersCount;
        }

        public void setFollowersCount(Integer followersCount) {
            this.followersCount = followersCount;
        }

        public Integer getBlacklisted() {
            return blacklisted;
        }

        public void setBlacklisted(Integer blacklisted) {
            this.blacklisted = blacklisted;
        }

        public Integer getBlacklistedByMe() {
            return blacklistedByMe;
        }

        public void setBlacklistedByMe(Integer blacklistedByMe) {
            this.blacklistedByMe = blacklistedByMe;
        }

        public Integer getIsFavorite() {
            return isFavorite;
        }

        public void setIsFavorite(Integer isFavorite) {
            this.isFavorite = isFavorite;
        }

        public Integer getIsHiddenFromFeed() {
            return isHiddenFromFeed;
        }

        public void setIsHiddenFromFeed(Integer isHiddenFromFeed) {
            this.isHiddenFromFeed = isHiddenFromFeed;
        }

        public Integer getCommonCount() {
            return commonCount;
        }

        public void setCommonCount(Integer commonCount) {
            this.commonCount = commonCount;
        }

        public Occupation getOccupation() {
            return occupation;
        }

        public void setOccupation(Occupation occupation) {
            this.occupation = occupation;
        }

        public List<Object> getCareer() {
            return career;
        }

        public void setCareer(List<Object> career) {
            this.career = career;
        }

        public List<Object> getMilitary() {
            return military;
        }

        public void setMilitary(List<Object> military) {
            this.military = military;
        }

        public Integer getUniversity() {
            return university;
        }

        public void setUniversity(Integer university) {
            this.university = university;
        }

        public String getUniversityName() {
            return universityName;
        }

        public void setUniversityName(String universityName) {
            this.universityName = universityName;
        }

        public Integer getFaculty() {
            return faculty;
        }

        public void setFaculty(Integer faculty) {
            this.faculty = faculty;
        }

        public String getFacultyName() {
            return facultyName;
        }

        public void setFacultyName(String facultyName) {
            this.facultyName = facultyName;
        }

        public Integer getGraduation() {
            return graduation;
        }

        public void setGraduation(Integer graduation) {
            this.graduation = graduation;
        }

        public String getHomeTown() {
            return homeTown;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

        public Integer getRelation() {
            return relation;
        }

        public void setRelation(Integer relation) {
            this.relation = relation;
        }

        public Personal getPersonal() {
            return personal;
        }

        public void setPersonal(Personal personal) {
            this.personal = personal;
        }

        public String getInterests() {
            return interests;
        }

        public void setInterests(String interests) {
            this.interests = interests;
        }

        public String getMusic() {
            return music;
        }

        public void setMusic(String music) {
            this.music = music;
        }

        public String getActivities() {
            return activities;
        }

        public void setActivities(String activities) {
            this.activities = activities;
        }

        public String getMovies() {
            return movies;
        }

        public void setMovies(String movies) {
            this.movies = movies;
        }

        public String getTv() {
            return tv;
        }

        public void setTv(String tv) {
            this.tv = tv;
        }

        public String getBooks() {
            return books;
        }

        public void setBooks(String books) {
            this.books = books;
        }

        public String getGames() {
            return games;
        }

        public void setGames(String games) {
            this.games = games;
        }

        public List<University> getUniversities() {
            return universities;
        }

        public void setUniversities(List<University> universities) {
            this.universities = universities;
        }

        public List<School> getSchools() {
            return schools;
        }

        public void setSchools(List<School> schools) {
            this.schools = schools;
        }

        public String getAbout() {
            return about;
        }

        public void setAbout(String about) {
            this.about = about;
        }

        public List<Relative> getRelatives() {
            return relatives;
        }

        public void setRelatives(List<Relative> relatives) {
            this.relatives = relatives;
        }

        public String getQuotes() {
            return quotes;
        }

        public void setQuotes(String quotes) {
            this.quotes = quotes;
        }

    }


    public class School {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("country")
        @Expose
        private Integer country;
        @SerializedName("city")
        @Expose
        private Integer city;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("year_from")
        @Expose
        private Integer yearFrom;
        @SerializedName("year_to")
        @Expose
        private Integer yearTo;
        @SerializedName("year_graduated")
        @Expose
        private Integer yearGraduated;
        @SerializedName("class")
        @Expose
        private String _class;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Integer getCountry() {
            return country;
        }

        public void setCountry(Integer country) {
            this.country = country;
        }

        public Integer getCity() {
            return city;
        }

        public void setCity(Integer city) {
            this.city = city;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getYearFrom() {
            return yearFrom;
        }

        public void setYearFrom(Integer yearFrom) {
            this.yearFrom = yearFrom;
        }

        public Integer getYearTo() {
            return yearTo;
        }

        public void setYearTo(Integer yearTo) {
            this.yearTo = yearTo;
        }

        public Integer getYearGraduated() {
            return yearGraduated;
        }

        public void setYearGraduated(Integer yearGraduated) {
            this.yearGraduated = yearGraduated;
        }

        public String getClass_() {
            return _class;
        }

        public void setClass_(String _class) {
            this._class = _class;
        }

    }


    public class University {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("country")
        @Expose
        private Integer country;
        @SerializedName("city")
        @Expose
        private Integer city;
        @SerializedName("name")
        @Expose
        private String name;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getCountry() {
            return country;
        }

        public void setCountry(Integer country) {
            this.country = country;
        }

        public Integer getCity() {
            return city;
        }

        public void setCity(Integer city) {
            this.city = city;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

}
