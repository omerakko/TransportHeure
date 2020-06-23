package info.androidhive.recyclerview;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import androidx.appcompat.widget.Toolbar;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private List<Movie> movieList = new ArrayList<>();
    private MoviesAdapter mAdapter;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        // TODO: 25.05.2020 : modify recycleView movie class in order to adapt for data that will be received from database. 
        // TODO: 25.05.2020 : add device token for cloud messaging between different devices. 
        mAdapter = new MoviesAdapter(movieList);
       /* Movie test = new Movie("Les inforrrmation necessaire pour le chauffeur",
                "blabla", "1997", "a", "b", "b", "b", "b",
                "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b"
                , "b", "b", "b");*/
        /*Movie test1= new Movie("ok","ok1","1997");
        Movie test2= new Movie("ok","ok1","1997");
        Movie test3= new Movie("ok","ok1","1997");
        Movie test4= new Movie("ok","ok1","1997");
        Movie test5= new Movie("ok","ok1","1997");
        Movie test6= new Movie("ok","ok1","1997");
        Movie test7= new Movie("ok","ok1","1997");
        Movie test8= new Movie("ok","ok1","1997");
        Movie test9= new Movie("ok","ok1","1997");
        Movie test10= new Movie("ok","ok1","1997");
        Movie test11= new Movie("ok","ok1","1997");*/
       // movieList.add(test);
        /*movieList.add(test1);
        movieList.add(test2);
        movieList.add(test3);
        movieList.add(test4);
        movieList.add(test5);
        movieList.add(test6);
        movieList.add(test7);
        movieList.add(test8);
        movieList.add(test9);
        movieList.add(test10);
        movieList.add(test11);*/

        recyclerView.setHasFixedSize(true);
        /*final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("BookedTransport");
        myRef.setValue("Hello, World!");*/

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        //DatabaseReference myRef = database.getReference("message");
        DatabaseReference connectedRef = database.getReference("test");

        //myRef.setValue("Hello, World!");


        /*DatabaseReference myRef1 = database.getReference("message1");
         *myRef1.setValue("Hello OMArrrrR, World!");
         */
        //myRef.setValue("Hello OMAR, World!");


        // Read from the database
        connectedRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
               /* boolean connected = dataSnapshot.getValue(Boolean.class);
                if (connected) {
                    Log.d(TAG, "connected");
                } else {
                    Log.d(TAG, "not connected");
                }*/
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                  String value = dataSnapshot.child("omer").getValue(String.class);

                  System.out.println(value);
                //String[] a = new String[5];
                //a = (String[]) dataSnapshot.getValue();
                //  assert a != null;
                // Log.d(TAG, "Value is: " + a.toString());

/*                String a = Objects.requireNonNull(dataSnapshot.child("BookingId").getValue()).toString();
                String b = Objects.requireNonNull(dataSnapshot.child("Co" +
                        "ordinate").child("0").child("address").getValue()).toString();
                String c = Objects.requireNonNull(dataSnapshot.child("Co" +
                        "ordinate").child("0").child("formatted_adress").getValue()).toString();
                String d = Objects.requireNonNull(dataSnapshot.child("Co" +
                        "ordinate").child("0").child("lat").getValue()).toString();
                String e = Objects.requireNonNull(dataSnapshot.child("Co" +
                        "ordinate").child("0").child("lng").getValue()).toString();
                String f = Objects.requireNonNull(dataSnapshot.child("Co" +
                        "ordinate").child("1").child("address").getValue()).toString();
                String g = Objects.requireNonNull(dataSnapshot.child("Co" +
                        "ordinate").child("1").child("formatted_address").getValue()).toString();
                String h = Objects.requireNonNull(dataSnapshot.child("Co" +
                        "ordinate").child("1").child("lat").getValue()).toString();
                // System.out.println(a + "owowoefwofwofweofewowowowoow" + b);
                String i = Objects.requireNonNull(dataSnapshot.child("Co" +
                        "ordinate").child("1").child("lng").getValue()).toString();

                String j = Objects.requireNonNull(dataSnapshot.child("CustomerAddress").getValue()).toString();
                String k = Objects.requireNonNull(dataSnapshot.child("CustomerName").getValue()).toString();
                String l = Objects.requireNonNull(dataSnapshot.child("CustomerNumber").getValue()).toString();
                String m = Objects.requireNonNull(dataSnapshot.child("ExtraTime").getValue()).toString();
                String n = Objects.requireNonNull(dataSnapshot.child("ExtraWorker").getValue()).toString();
                String o = Objects.requireNonNull(dataSnapshot.child("TotalPrice").getValue()).toString();
                String p = Objects.requireNonNull(dataSnapshot.child("TransportDate").getValue()).toString();
                String q = Objects.requireNonNull(dataSnapshot.child("TransportHour").getValue()).toString();
                String r = Objects.requireNonNull(dataSnapshot.child("VehicleType").getValue()).toString();
                Movie movie;
                movie = new Movie(a,b, c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r);
                movieList.add(movie);


                // movieList.add(movie);
                //Movie movie = new Movie(a[0], "", "");
                //movieList.add(movie);
                mAdapter.notifyDataSetChanged();*/
                //String value = dataSnapshot.getValue(String.class);
                Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        // vertical RecyclerView
        // keep movie_list_row.xml width to `match_parent`
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

        // horizontal RecyclerView
        // keep movie_list_row.xml width to `wrap_content`
        // RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);

        recyclerView.setLayoutManager(mLayoutManager);

        // adding inbuilt divider line
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        // adding custom divider line with padding 16dp
        // recyclerView.addItemDecoration(new MyDividerItemDecoration(this, LinearLayoutManager.HORIZONTAL, 16));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(mAdapter);

        // row click listener
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Movie movie = movieList.get(position);
                Toast.makeText(getApplicationContext(), movie.getBookingId() + " booking id number is selected!", Toast.LENGTH_SHORT).show();
                // movieList.remove(movie);
                // mAdapter.notifyItemRemoved(position);
                // TODO: 23.05.2020 if demand accepted, add/ store row info in a container containing all accepted offers for displaying them better in new activity. Then you can if you wish delete completely accepted offer too from that activity.
                // TODO: 23.05.2020 if user accept demand store it for new activty. if not accept then send to next user device via fire cloud messaging or something. 
                AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                builder1.setMessage("Souhaitez vous accepter la demande de transportation du client ?");
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "Oui",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //Do your code...
                                // TODO: 25.05.2020 1.delete row from mainActivty recycleview. 2.add accepted demand to sqlLite? or add it to new recycle view to display it in new activty which can be accessed with acceptedDemandButton ? 

                            }
                        });

                builder1.setNegativeButton(
                        "Non",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                // TODO: 25.05.2020  1.delete row from mainActivty recycleview. 2. send clicked Row to next device via: push Notification || firebase cloud messaging || data messaging...
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();

            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        prepareMovieData();
    }

    /**
     * Prepares sample data to provide data set to adapter
     */
    private void prepareMovieData() {


        // notify adapter about data set changes
        // so that it will render the list with new data
        mAdapter.notifyDataSetChanged();

    }

}
