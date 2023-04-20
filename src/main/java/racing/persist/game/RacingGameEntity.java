package racing.persist.game;

import java.time.LocalDateTime;

public class RacingGameEntity {
    private Long gameId;
    private LocalDateTime createTime;
    private final int trialCount;

    public RacingGameEntity(int trialCount) {
        this.trialCount = trialCount;
    }

    public RacingGameEntity(Long gameId, LocalDateTime createTime, int trialCount) {
        this.gameId = gameId;
        this.createTime = createTime;
        this.trialCount = trialCount;
    }

    public Long getGameId() {
        return gameId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public int getTrialCount() {
        return trialCount;
    }
}
