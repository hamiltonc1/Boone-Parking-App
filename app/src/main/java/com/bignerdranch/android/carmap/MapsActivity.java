package com.bignerdranch.android.carmap;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {


    private static final LatLng BOONE = new LatLng(36.2095889,-81.6975904);
    private static final LatLng WESTKING = new LatLng(36.2183643,-81.685648);
    private static final LatLng DEPOTSTREET = new LatLng(36.2192563,-81.686013);
    private static final LatLng KINGLOT = new LatLng(36.2178185,-81.6840167);
    private static final LatLng QUEENLOT = new LatLng(36.21928,-81.682234);
    private static final LatLng PARKINGDECK = new LatLng(36.2160633,-81.682364);
    private static final LatLng INGLESLOT = new LatLng(36.2052483,-81.699383);
    private static final LatLng PUBLIXLOT = new LatLng(36.1998978,-81.6619985);
    private static final LatLng WALMARTLOT = new LatLng(36.1970281,-81.6604344);
    private static final LatLng CILANTROLOT = new LatLng(36.2194993,-81.688158);
    private static final LatLng STADIUMLOT = new LatLng(36.2134065,-81.6860657);
    private static final LatLng COLTRANELOT = new LatLng(36.2123892,-81.683134);
    private static final LatLng RALEYLOT = new LatLng(36.2161742,-81.684073);
    private static final LatLng QUEENSTREET = new LatLng(36.2201726,-81.6858446);
    private static final LatLng ALEHOUSE = new LatLng(36.2176175,-81.6867797);
    private static final LatLng PORTOS = new LatLng(36.2185491,-81.6867035);
    private static final LatLng BOONEMALLONE = new LatLng(36.2025936,-81.669176);
    private static final LatLng BOONEMALLTWO = new LatLng(36.2012083,-81.671397);
    private static final LatLng AMB = new LatLng(36.2036353,-81.6700603);
    private static final LatLng MINT = new LatLng(36.2011242,-81.659188);
    private static final LatLng GREENWAY = new LatLng(36.2050523,-81.653338);
    private static final LatLng FOODLION = new LatLng(36.1966023,-81.659078);
    private static final LatLng STATEFARM = new LatLng(36.2054333,-81.657855);
    private static final LatLng LOWES = new LatLng(36.2193453,-81.663975);
    private static final LatLng CHIPOTLE = new LatLng(36.1993573,-81.65937);

    public Marker mWestKing;
    public Marker mDepotStreet;
    public Marker mKingLot;
    public Marker mQueenLot;
    public Marker mParkingDeck;
    public Marker mInglesLot;
    public Marker mPublixLot;
    public Marker mWalMartLot;
    public Marker mCilantroLot;
    public Marker mStadiumLot;
    public Marker mColtraneLot;
    public Marker mRaleyLot;
    public Marker mQueenStreet;
    public Marker mAleHouse;
    public Marker mPortos;
    public Marker mBooneMallOne;
    public Marker mBooneMallTwo;
    public Marker mAmb;
    public Marker mMint;
    public Marker mGreenway;
    public Marker mFoodLion;
    public Marker mStateFarm;
    public Marker mLowes;
    public Marker mChipotle;
    public Marker mMyCar;

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(BOONE, 13));

        getMarker();

<<<<<<< HEAD
        MarkerOptions options = new MarkerOptions()
=======
        mMyCar = mMap.addMarker(new MarkerOptions()
>>>>>>> origin/master
                        .position(BOONE)
                        .title("My Car")
                        .snippet("This is where I am parked")
                        .icon(BitmapDescriptorFactory
<<<<<<< HEAD
                                .defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
                        .draggable(true);

        mMyCar = mMap.addMarker(options);
=======
                                .defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
>>>>>>> origin/master

    }

    public void getMarker() {
        

        mWestKing= mMap.addMarker(new MarkerOptions()
                .position(WESTKING)
                .title("West King Street")
                .snippet("Metered Parking, high chance of tow, free after 5")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        mDepotStreet = mMap.addMarker(new MarkerOptions()
                .position(DEPOTSTREET)
                .title("Depot Street Lot")
                .snippet("Paid Parking, high chance of tow, free after 5")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        mKingLot = mMap.addMarker(new MarkerOptions()
                .position(KINGLOT)
                .title("King Street Lot")
                .snippet("Paid parking, high chance of tow, free after 5")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_RED)) );

        mQueenLot = mMap.addMarker(new MarkerOptions()
                .position(QUEENLOT)
                .title("Queen Street lot")
                .snippet("Paid parking, high chance of tow, free after 5")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_RED)) );

        mParkingDeck = mMap.addMarker(new MarkerOptions()
                .position(PARKINGDECK)
                .title("Parking Deck")
                .snippet("1st floor 30 minute only, free, low chance of tow")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)) );

        mInglesLot = mMap.addMarker(new MarkerOptions()
                .position(INGLESLOT)
                .title("Ingles Lot")
                .snippet("Free but distant, low chance of tow")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)) );

        mPublixLot = mMap.addMarker(new MarkerOptions()
                .position(PUBLIXLOT)
                .title("Publix Lot")
                .snippet("Free but distant, low chance of tow")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        mWalMartLot = mMap.addMarker(new MarkerOptions()
                .position(WALMARTLOT)
                .title("WalMart Lot")
                .snippet("Free but distant, low chance of tow, beware meth dealers")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)) );

        mCilantroLot = mMap.addMarker(new MarkerOptions()
                .position(CILANTROLOT)
                .title("Ransom Lot")
                .snippet("Free, very high chance of tow")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        mStadiumLot = mMap.addMarker(new MarkerOptions()
                .position(STADIUMLOT)
                .title("Stadium Lot")
                .snippet("Permit only during school year, free over summer")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        mColtraneLot = mMap.addMarker(new MarkerOptions()
                .position(COLTRANELOT)
                .title("Coltrane Lot")
                .snippet("Permit only during school year, free over summer")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)) );

        mRaleyLot = mMap.addMarker(new MarkerOptions()
                .position(RALEYLOT)
                .title("Raley Lot")
                .snippet("Permit only during school year, free over summer")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)) );

        mQueenStreet = mMap.addMarker(new MarkerOptions()
                .position(QUEENSTREET)
                .title("Queen Street")
                .snippet("Meter parking, high chance of tow, free after 5")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_RED)) );

        mAleHouse = mMap.addMarker(new MarkerOptions()
                .position(ALEHOUSE)
                .title("Ale House Lot")
                .snippet("Free, high chance of tow")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        mPortos = mMap.addMarker(new MarkerOptions()
                .position(PORTOS)
                .title("Portofino Lot")
                .snippet("Free, high chance of tow")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        mBooneMallOne = mMap.addMarker(new MarkerOptions()
                .position(BOONEMALLONE)
                .title("Boone Mall Front")
                .snippet("Free but distant")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        mBooneMallTwo = mMap.addMarker(new MarkerOptions()
                .position(BOONEMALLTWO)
                .title("Boone Mall Rear")
                .snippet("Free but distant")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        mAmb = mMap.addMarker(new MarkerOptions()
                .position(AMB)
                .title("AMB Lot")
                .snippet("Free but distant")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        mMint = mMap.addMarker(new MarkerOptions()
                .position(MINT)
                .title("Mint Lot")
                .snippet("Free but distant")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        mGreenway = mMap.addMarker(new MarkerOptions()
                .position(GREENWAY)
                .title("Greenway Parking")
                .snippet("Free but distant")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        mFoodLion = mMap.addMarker(new MarkerOptions()
                .position(FOODLION)
                .title("Food Lion Lot")
                .snippet("Free but distant, beware meth dealers")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        mStateFarm = mMap.addMarker(new MarkerOptions()
                .position(STATEFARM)
                .title("State Farm Lot")
                .snippet("Free but distant")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        mLowes = mMap.addMarker(new MarkerOptions()
                .position(LOWES)
                .title("Lowes Lot")
                .snippet("Free but distant")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)) );

        mChipotle = mMap.addMarker(new MarkerOptions()
                .position(CHIPOTLE)
                .title("Chipotle Lot")
                .snippet("Free but far")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)) );
    }

}
