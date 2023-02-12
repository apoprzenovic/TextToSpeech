import javax.speech.Central;
import javax.speech.Engine;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TTS {

    private VoiceManager voiceManager;
    private Voice kevin16;

    public TTS() {

        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        voiceManager = VoiceManager.getInstance();

        kevin16 = voiceManager.getVoice("kevin16");
        kevin16.allocate();

    }

    public void readOutLoud(String txt) {
        kevin16.speak(txt);
    }

    public void deallacateVoice() {
        kevin16.deallocate();
    }

}
