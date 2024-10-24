package software.ulpgc.kata2;

import java.util.List;

public record Title(String id, String titleType,
                    String primaryTitle, String originalTitle,
                    boolean isAdult, int start_year, int end_year,
                    int duration, String genres) {

    public enum TitleType {
        VideoGame,
        TvShort,
        Movie,
        TvSeries,
        TvMiniSeries,
        TvSpecial,
        TvMovie,
        TvEpisode,
        Video,
        TvPilot,
        Short,
    }
}