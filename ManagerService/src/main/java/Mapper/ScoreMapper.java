package Mapper;


import java.util.List;

import model.Score;

public interface ScoreMapper {
	public List<Score> queryAllScore();
	public Score queryScoreByName(String name);
	public void updateScore(Score score);
}
