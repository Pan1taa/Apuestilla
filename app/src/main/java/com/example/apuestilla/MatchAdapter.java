package com.example.apuestilla;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.MatchViewHolder> {

    private final List<Match> matches;

    public MatchAdapter(List<Match> matches) {
        this.matches = matches;
    }

    @NonNull
    @Override
    public MatchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_match, parent, false);
        return new MatchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchViewHolder holder, int position) {
        Match match = matches.get(position);
        holder.imageViewHome.setImageResource(match.getHomeTeamImage());
        holder.textViewHomeTeam.setText(match.getHomeTeamName());
        holder.imageViewAway.setImageResource(match.getAwayTeamImage());
        holder.textViewAwayTeam.setText(match.getAwayTeamName());
        holder.textViewScore.setText(match.getScore());
        holder.textViewTime.setText(match.getTime());
        holder.textViewBetOption1.setText(match.getBetOption1());
        holder.textViewBetOptionX.setText(match.getBetOptionX());
        holder.textViewBetOption2.setText(match.getBetOption2());
    }

    @Override
    public int getItemCount() {
        return matches.size();
    }

    static class MatchViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewHome;
        TextView textViewHomeTeam;
        ImageView imageViewAway;
        TextView textViewAwayTeam;
        TextView textViewScore;
        TextView textViewTime;
        TextView textViewBetOption1;
        TextView textViewBetOptionX;
        TextView textViewBetOption2;

        MatchViewHolder(View itemView) {
            super(itemView);
            imageViewHome = itemView.findViewById(R.id.imageViewHome);
            textViewHomeTeam = itemView.findViewById(R.id.textViewHomeTeam);
            imageViewAway = itemView.findViewById(R.id.imageViewAway);
            textViewAwayTeam = itemView.findViewById(R.id.textViewAwayTeam);
            textViewScore = itemView.findViewById(R.id.textViewScore);
            textViewTime = itemView.findViewById(R.id.textViewTime);
            textViewBetOption1 = itemView.findViewById(R.id.textViewBetOption1);
            textViewBetOptionX = itemView.findViewById(R.id.textViewBetOptionX);
            textViewBetOption2 = itemView.findViewById(R.id.textViewBetOption2);
        }
    }
}