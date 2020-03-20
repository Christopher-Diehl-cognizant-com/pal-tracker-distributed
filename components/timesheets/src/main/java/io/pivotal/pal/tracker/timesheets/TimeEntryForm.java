package io.pivotal.pal.tracker.timesheets;

/**
 *
 * @author 780449
 */
public class TimeEntryForm {

	/**
	 *
	 */
	public final long projectId;

	/**
	 *
	 */
	public final long userId;

	/**
	 *
	 */
	public final String date;

	/**
	 *
	 */
	public final int hours;

    private TimeEntryForm() { // for jackson
        this(timeEntryFormBuilder());
    }

    private TimeEntryForm(Builder builder) {
        projectId = builder.projectId;
        userId = builder.userId;
        date = builder.date;
        hours = builder.hours;
    }

	/**
	 *
	 * @return
	 */
	public static Builder timeEntryFormBuilder() {
        return new Builder();
    }

	/**
	 *
	 */
	public static class Builder {
        private long id;
        private long projectId;
        private long userId;
        private String date;
        private int hours;

		/**
		 *
		 * @param id
		 * @return
		 */
		public Builder id(long id) {
            this.id = id;
            return this;
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
		 * @param userId
		 * @return
		 */
		public Builder userId(long userId) {
            this.userId = userId;
            return this;
        }

		/**
		 *
		 * @param date
		 * @return
		 */
		public Builder date(String date) {
            this.date = date;
            return this;
        }

		/**
		 *
		 * @param hours
		 * @return
		 */
		public Builder hours(Integer hours) {
            this.hours = hours;
            return this;
        }

			/**
			 *
			 * @return
			 */
			public TimeEntryForm build() {
            return new TimeEntryForm(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TimeEntryForm that = (TimeEntryForm) o;

        if (projectId != that.projectId) return false;
        if (userId != that.userId) return false;
        if (hours != that.hours) return false;
        return date != null ? date.equals(that.date) : that.date == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (projectId ^ (projectId >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + hours;
        return result;
    }

    @Override
    public String toString() {
        return "TimeEntryForm{" +
            "projectId=" + projectId +
            ", userId=" + userId +
            ", date='" + date + '\'' +
            ", hours=" + hours +
            '}';
    }
}
