import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.*;

/**
 * Created by Menelaos Kotsollaris on 2017-02-06.
 *
 * Class Explanation: TODO
 */
public class MainClass
{

    public static void smooth(String filename)
    {
        IplImage image = cvLoadImage(filename);
        if(image != null)
        {
            cvSmooth(image, image);
            cvSaveImage(filename, image);
            cvReleaseImage(image);
        }
    }
}
