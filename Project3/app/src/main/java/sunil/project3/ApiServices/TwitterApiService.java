package sunil.project3.ApiServices;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import sunil.project3.Guardian.ResponseBody;
import sunil.project3.Twitter.TwitterContent;


public interface TwitterApiService {

    // yeah, i used the solution for reference... nice mind tricks with the formatting btw
    @POST("oauth2/token")
    Call<okhttp3.ResponseBody>getToken(
            @Header("Authorization") String auth,
            @Header("Content-Type") String content,
            @Query("grant_type") String grant);


    @GET("1.1/statuses/user_timeline.json")
    Call<TwitterContent>getTimeline(
            @Header("Authorization") String auth,
            @Header("Content-Type") String appjson,
            @Query("screen_name") String screenName,
            @Query("count") int cnt);

}

