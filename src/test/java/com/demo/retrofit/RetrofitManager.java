package com.demo.retrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;


public class RetrofitManager {
    //构建Retrofit实例
    Retrofit retrofit = new Retrofit.Builder()
            //设置网络请求BaseUrl地址,后续配置化
            .baseUrl("https://devh5.moutai519.com.cn/")
            //设置数据解析器
            .addConverterFactory(GsonConverterFactory.create())
            .client(getOkHttpClient())
            .build();

    private static OkHttpClient getOkHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS);

        //自定义拦截器OkHttpLogger将日志输出到文本
      //  builder.interceptors().add(new OkHttpLogger());
        return builder.build();
    }

}
