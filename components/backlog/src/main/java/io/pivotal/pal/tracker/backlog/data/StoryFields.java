package io.pivotal.pal.tracker.backlog.data;

/**
 *
 * @author 780449
 */
public class StoryFields {

	/**
	 *
	 */
	public final long projectId;

	/**
	 *
	 */
	public final String name;

    private StoryFields(Builder builder) {
        projectId = builder.projectId;
        name = builder.name;
    }

	/**
	 *
	 * @return
	 */
	public static Builder storyFieldsBuilder() {
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
		public StoryFields build() {
            return new StoryFields(this);
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

        StoryFields that = (StoryFields) o;

        if (projectId != that.projectId) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (projectId ^ (projectId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StoryFields{" +
            "projectId=" + projectId +
            ", name='" + name + '\'' +
            '}';
    }
}
