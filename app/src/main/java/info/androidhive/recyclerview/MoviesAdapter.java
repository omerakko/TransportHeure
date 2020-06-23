package info.androidhive.recyclerview;

//import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    private List<Movie> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre, TransportHour,
                TransportDate,
                DepartAdress,
                DepartFormattedAdress,
                Departlat,
                Departlng,
                ArriveAddress,
                ArriveFormattedAddress,
                ArriveLat,
                ArriveLng,
                ExtraWorker,
                ExtraTime,
                TotalPrice,
                VehicleType,
                CustomerSurname,
                CustomerName,
                CustomerAddress,
                CustomerNumber,
                BookingId;

        public MyViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.title);
            genre = view.findViewById(R.id.genre);
            year = view.findViewById(R.id.year);
            TransportHour = view.findViewById(R.id.TransportHour);
            TransportDate = view.findViewById(R.id.TransportDate);
            DepartAdress = view.findViewById(R.id.DepartAddress);
            DepartFormattedAdress = view.findViewById(R.id.DepartFormattedAdress);
            Departlat = view.findViewById(R.id.Departlat);
            Departlng = view.findViewById(R.id.Departlng);
            ArriveAddress = view.findViewById(R.id.ArriveAddress);
            ArriveFormattedAddress = view.findViewById(R.id.ArriveFormattedAddress);
            ArriveLat = view.findViewById(R.id.ArriveLat);
            ArriveLng = view.findViewById(R.id.ArriveLng);
            ExtraWorker = view.findViewById(R.id.ExtraWorker);
            ExtraTime = view.findViewById(R.id.ExtraTime);
            TotalPrice = view.findViewById(R.id.TotalPrice);
            VehicleType = view.findViewById(R.id.VehicleType);
            CustomerSurname = view.findViewById(R.id.CustomerSurname);
            CustomerName = view.findViewById(R.id.CustomerName);
            CustomerAddress = view.findViewById(R.id.CustomerAddress);
            CustomerNumber = view.findViewById(R.id.CustomerNumber);
            BookingId = view.findViewById(R.id.BookingId);
        }
    }


    public MoviesAdapter(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movie movie = moviesList.get(position);
       /* holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());*/
        holder.TransportHour.setText(movie.getTransportHour());
        holder.TransportDate.setText(movie.getTransportDate());
        holder.DepartAdress.setText(movie.getDepartAdress());
        holder.DepartFormattedAdress.setText(movie.getDepartFormattedAdress());
        holder.Departlat.setText(movie.getDepartlat());
        holder.Departlng.setText(movie.getDepartlng());
        holder.ArriveAddress.setText(movie.getArriveAddress());
        holder.ArriveFormattedAddress.setText(movie.getArriveFormattedAddress());
        holder.ArriveLat.setText(movie.getArriveLat());
        holder.ArriveLng.setText(movie.getArriveLng());
        holder.ExtraWorker.setText(movie.getExtraWorker());
        holder.ExtraTime.setText(movie.getExtraTime());
        holder.TotalPrice.setText(movie.getTotalPrice());
        holder.VehicleType.setText(movie.getVehicleType());
        holder.CustomerSurname.setText(movie.getCustomerSurname());
        holder.CustomerName.setText(movie.getCustomerName());
        holder.CustomerAddress.setText(movie.getCustomerAddress());
        holder.CustomerNumber.setText(movie.getCustomerNumber());
        holder.BookingId.setText(movie.getCustomerNumber());


    }


    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
