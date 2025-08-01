package profile.java;

import java.util.List;

public abstract class Profile {
    private String headline;
    private String about;
    private String gender;
    private List<Character> profilePicture;
    private List<Character> coverPhoto;

    private List<Experience> experiences;
    private List<Education> educations;
    private List<Skill> skills;
    private List<Achievement> achievements;
    private List<Recommendation> recommendations;
    private Analytics analytics;

    public abstract boolean addExperience(Experience experience);

    public abstract boolean addEducation(Education education);

    public abstract boolean addSkill(Skill skill);

    public abstract boolean addAchievement(Achievement achievement);
}
