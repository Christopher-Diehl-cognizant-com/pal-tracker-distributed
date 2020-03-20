package io.pivotal.pal.tracker.projects.data;

/**
 *
 * @author 780449
 */
public class ProjectRecord {

	/**
	 *
	 */
	public final long id;

	/**
	 *
	 */
	public final long accountId;

	/**
	 *
	 */
	public final String name;

	/**
	 *
	 */
	public final boolean active;

    private ProjectRecord(Builder builder) {
        id = builder.id;
        accountId = builder.accountId;
        name = builder.name;
        active = builder.active;
    }

	/**
	 *
	 * @return
	 */
	public static Builder projectRecordBuilder() {
        return new Builder();
    }

	/**
	 *
	 */
	public static class Builder {
        private long id;
        private long accountId;
        private String name;
        private boolean active;

			/**
			 *
			 * @return
			 */
			public ProjectRecord build() {
            return new ProjectRecord(this);
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
			 * @param accountId
			 * @return
			 */
			public Builder accountId(long accountId) {
            this.accountId = accountId;
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

			/**
			 *
			 * @param active
			 * @return
			 */
			public Builder active(boolean active) {
            this.active = active;
            return this;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectRecord that = (ProjectRecord) o;

        if (id != that.id) return false;
        if (accountId != that.accountId) return false;
        if (active != that.active) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (accountId ^ (accountId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (active ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProjectRecord{" +
            "id=" + id +
            ", accountId=" + accountId +
            ", name='" + name + '\'' +
            ", active=" + active +
            '}';
    }
}

