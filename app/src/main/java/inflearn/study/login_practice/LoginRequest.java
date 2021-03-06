package inflearn.study.login_practice;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {
    // 서버 url 설정
    final static private String URL = "http://lisa2009343.dothome.co.kr/Login.php";
    private Map<String,String> map;

    public LoginRequest(String userID, String userPassword, Response.Listener<String> listener){
        super(Method.POST, URL, listener,null);

        map = new HashMap<>();
        map.put("userID",userID);
        map.put("userPassword",userPassword);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
