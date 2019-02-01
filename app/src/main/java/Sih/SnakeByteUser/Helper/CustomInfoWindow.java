package Sih.SnakeByteUser.Helper;

import android.view.LayoutInflater;
import android.view.View;
import android.content.Context;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

import Sih.SnakeByteUser.R;


public class CustomInfoWindow implements GoogleMap.InfoWindowAdapter {
    View myView;
    public CustomInfoWindow(Context context) {
        myView = LayoutInflater.from(context)
                .inflate(R.layout.custom_locate_police_info_user,null);

    }

    @Override
    public View getInfoWindow(Marker marker) {
        TextView txtEmergencyPlaceTitle = myView.findViewById(R.id.txtEmergencyPlaceInfo);
        txtEmergencyPlaceTitle.setText(marker.getTitle());

        TextView txtEmergencyPlaceSnippet = myView.findViewById(R.id.txtEmergencyPlaceSnippet);
        txtEmergencyPlaceSnippet.setText(marker.getTitle());

        return myView;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
