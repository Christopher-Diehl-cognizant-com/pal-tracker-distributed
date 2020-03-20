package io.pivotal.pal.tracker.backlog;

/**
 *
 * @author 780449
 */
public class StoryForm {

	/**
	 *
	 */
	public final long projectId;

	/**
	 *
	 */
	public final String name;

    private StoryForm() {
        this(storyFormBuilder());
    }

    private StoryForm(Builder builder) {
        projectId = builder.projectId;
        name = builder.name;
    }

	/**
	 *
	 * @return
	 */
	public static Builder storyFormBuilder() {
        return new Builder();
    }

	/**
	 *
	 */
	public static class Builder {
        private long projectId;
        private String name;

		/**
		 *
		 * @return
		 */
		public StoryForm build() {
            return new StoryForm(this);
        }

		/**
		 *
		 * @param projectId
		 * @return
		 */
		public Builder projectId(long projectId) {
            this.projectId = projectId;
            return this;
        }

		/**
		 *
		 * @param name
		 * @return
		 */
		public Builder name(String name) {
            this.name = name;
            return this;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StoryForm storyForm = (StoryForm) o;

        if (projectId != storyForm.projectId) return false;
        return name != null ? name.equals(storyForm.name) : storyForm.name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (projectId ^ (projectId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StoryForm{" +
            "projectId=" + projectId +
            ", name='" + name + '\'' +
            '}';
    }
}
