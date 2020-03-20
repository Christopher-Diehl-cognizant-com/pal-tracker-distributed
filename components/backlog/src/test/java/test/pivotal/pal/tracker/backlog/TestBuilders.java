package test.pivotal.pal.tracker.backlog;

import io.pivotal.pal.tracker.backlog.StoryForm;
import io.pivotal.pal.tracker.backlog.StoryInfo;
import io.pivotal.pal.tracker.backlog.data.StoryFields;
import io.pivotal.pal.tracker.backlog.data.StoryRecord;

import static io.pivotal.pal.tracker.backlog.StoryForm.storyFormBuilder;
import static io.pivotal.pal.tracker.backlog.StoryInfo.storyInfoBuilder;
import static io.pivotal.pal.tracker.backlog.data.StoryFields.storyFieldsBuilder;
import static io.pivotal.pal.tracker.backlog.data.StoryRecord.storyRecordBuilder;

/**
 *
 * @author 780449
 */
public class TestBuilders {

	/**
	 *
	 * @return
	 */
	public static StoryRecord.Builder testStoryRecordBuilder() {
        return storyRecordBuilder()
            .id(4L)
            .projectId(3L)
            .name("Something Fun");
    }

	/**
	 *
	 * @return
	 */
	public static StoryFields.Builder testStoryFieldsBuilder() {
        return storyFieldsBuilder()
            .projectId(3L)
            .name("Something Fun");
    }

	/**
	 *
	 * @return
	 */
	public static StoryInfo.Builder testStoryInfoBuilder() {
        return storyInfoBuilder()
            .id(4L)
            .projectId(3L)
            .name("Something Fun")
            .info("story info");
    }

	/**
	 *
	 * @return
	 */
	public static StoryForm.Builder testStoryFormBuilder() {
        return storyFormBuilder()
            .projectId(3L)
            .name("Something Fun");
    }
}
