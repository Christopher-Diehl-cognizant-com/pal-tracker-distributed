package io.pivotal.pal.tracker.allocations.data;

import java.time.LocalDate;

/**
 *
 * @author 780449
 */
public class AllocationRecord {

	/**
	 *
	 */
	public final long id;

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
	public final LocalDate firstDay;

	/**
	 *
	 */
	public final LocalDate lastDay;

	/**
	 *
	 * @param builder
	 */
	public AllocationRecord(Builder builder) {
        id = builder.id;
        projectId = builder.projectId;
        userId = builder.userId;
        firstDay = builder.firstDay;
        lastDay = builder.lastDay;
    }

	/**
	 *
	 * @return
	 */
	public static Builder allocationRecordBuilder() {
        return new Builder();
    }

	/**
	 *
	 */
	public static class Builder {
        private long id;
        private long projectId;
        private long userId;
        private LocalDate firstDay;
        private LocalDate lastDay;

			/**
			 *
			 * @return
			 */
			public AllocationRecord build() {
            return new AllocationRecord(this);
        }

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
			 * @param firstDay
			 * @return
			 */
			public Builder firstDay(LocalDate firstDay) {
            this.firstDay = firstDay;
            return this;
        }

		/**
		 *
		 * @param lastDay
		 * @return
		 */
		public Builder lastDay(LocalDate lastDay) {
            this.lastDay = lastDay;
            return this;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AllocationRecord that = (AllocationRecord) o;

        if (id != that.id) return false;
        if (projectId != that.projectId) return false;
        if (userId != that.userId) return false;
        if (firstDay != null ? !firstDay.equals(that.firstDay) : that.firstDay != null)
            return false;
        return lastDay != null ? lastDay.equals(that.lastDay) : that.lastDay == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (projectId ^ (projectId >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (firstDay != null ? firstDay.hashCode() : 0);
        result = 31 * result + (lastDay != null ? lastDay.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AllocationRecord{" +
            "id=" + id +
            ", projectId=" + projectId +
            ", userId=" + userId +
            ", firstDay=" + firstDay +
            ", lastDay=" + lastDay +
            '}';
    }
}
