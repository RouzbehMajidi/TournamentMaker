package geeks.tournamentmaker;

import android.provider.BaseColumns;

/**
 * Created by Oliver on 12/1/2015.
 */
public final class TournamentContract {
    public TournamentContract(){}
    public static abstract class TournamentEntry implements BaseColumns {
        public static final String TABLE_NAME = "tournaments";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_STATUS = "status";
    }
    public static abstract class MatchEntry implements BaseColumns{
        public static final String TABLE_NAME = "matches";
        public static final String COLUMN_NAME_TOURNAMENT_ID = "tournamentid";
        public static final String COLUMN_NAME_TEAM1 = "team1";
        public static final String COLUMN_NAME_TEAM2 = "team2";
        public static final String COLUMN_NAME_SCORE1 = "score1";
        public static final String COLUMN_NAME_SCORE2 = "score2";
    }
    public static abstract class TeamEntry implements BaseColumns{
        public static final String TABLE_NAME = "teams";
        public static final String COLUMN_NAME_NAME = "name";
    }
}

