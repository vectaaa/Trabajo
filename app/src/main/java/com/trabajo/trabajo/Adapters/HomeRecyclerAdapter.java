package com.trabajo.trabajo.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.gadspracticeproject.R;
import com.gadspracticeproject.Trabajo.Models.HomeJobsModel;

import org.jetbrains.annotations.NotNull;
import java.util.List;

public class HomeRecyclerAdapter extends RecyclerView.Adapter<HomeRecyclerAdapter.ViewHolder> {
    private static final String TAG = "HomeRecyclerAdapter";

    private List<HomeJobsModel> homeJobsModelList;
    private Context mContext;

    public void setData(List<HomeJobsModel> homeJobsModel) {
        this.homeJobsModelList = homeJobsModel;
    }

    public HomeRecyclerAdapter(Context context) {
        this.mContext = context;
    }


    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: created");
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.jobs_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {
        HomeJobsModel homeJobsModel = homeJobsModelList.get(position);
//        Log.d(TAG, "onBindViewHolder: Setting Items");
//        Glide.with(mContext).asBitmap().load(homeJobsModel.getCompanyIcon()).into(holder.companyLogo);

        holder.name.setText(homeJobsModel.getCompanyName());
        holder.details.setText(homeJobsModel.getJobDetails());
        holder.companyLogo.setImageResource(homeJobsModel.getCompanyIcon());
    }

    @Override
    public int getItemCount() {
        return homeJobsModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView companyLogo;
        TextView name, details, location;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            companyLogo = itemView.findViewById(R.id.company_logo);
            name = itemView.findViewById(R.id.company_name);
            details = itemView.findViewById(R.id.job_details);
        }
    }
}
