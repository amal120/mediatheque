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
public class BackgroundTask2 extends AsyncTask <String,Void,String> {
    Context ctx;

    BackgroundTask2(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    protected void onPreExecute() {

        super.onPreExecute();
    }

    @Override
    protected String doInBackground(String... params) {
        String doc_url = "http://192.168.124.1/media/doc.php";
        String method = params[0];
        if (params != null && method.equals("resdoc"))

        {
            String matriculet = params[1];
            String dateEmprunt = params[2];
            String titreD = params[3];
            try {
                URL url = new URL(doc_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream OS = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(OS, "UTF-8"));
                String data = URLEncoder.encode("matriculet", "UTF-8") + "=" + URLEncoder.encode(matriculet, "UTF-8") + "&" +
                        URLEncoder.encode("dateEmprunt", "UTF-8") + "=" + URLEncoder.encode(dateEmprunt, "UTF-8") + "&" +
                        URLEncoder.encode("titreD", "UTF-8") + "=" + URLEncoder.encode(titreD, "UTF-8");
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
