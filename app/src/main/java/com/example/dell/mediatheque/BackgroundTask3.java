package com.example.dell.mediatheque;

import android.app.AlertDialog;
import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by DELL on 07/04/2016.
 */
public class BackgroundTask3 extends AsyncTask <String,Void,String> {
    Context ctx;

    BackgroundTask3(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    protected void onPreExecute() {

       super.onPreExecute();
    }

    @Override
    protected String doInBackground(String... params) {
        String plc_url = "http://192.168.124.1/media/place.php";
        String method = params[0];
        if (method.equals("reservplac"))

        {
            String mat_etud = params[1];
            String dateRes = params[2];
            String heureRes = params[3];
            try {
                URL url = new URL(plc_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream OS = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(OS, "UTF-8"));
                String data = URLEncoder.encode("dateRes", "UTF-8") + "=" + URLEncoder.encode(dateRes, "UTF-8") + "&" +
                        URLEncoder.encode("heureRes", "UTF-8") + "=" + URLEncoder.encode(heureRes, "UTF-8") + "&" +
                        URLEncoder.encode("mat_etud", "UTF-8") + "=" + URLEncoder.encode(mat_etud, "UTF-8");
                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                OS.close();
                InputStream IS = httpURLConnection.getInputStream();
                IS.close();
                httpURLConnection.disconnect();
                return "Reservation Success...";
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

   @Override
    protected void onPostExecute(String result) {
       Toast.makeText(ctx, result, Toast.LENGTH_LONG).show();

   }

}
