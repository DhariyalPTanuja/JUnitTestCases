package com.moodanalyzer.MoodAnalyzerTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MoodAnalyzerTest {
	
//UC1 Given a Message, ability to analyse and respond  Happy or Sad Mood
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain();
		String mood = moodAnalyser.getMessage();
		Assert.assertEquals("SAD", mood);
	}
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain("HAPPY");
		String mood = moodAnalyser.getMessage();

		Assert.assertEquals("HAPPY", mood);
	}

}