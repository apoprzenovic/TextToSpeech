import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.speech.Central;
import javax.speech.Engine;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TTS {

    public TTS() {
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        VoiceManager voiceManager = VoiceManager.getInstance();
    }

    public static void main(String[] args) throws Exception {
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        VoiceManager voiceManager = VoiceManager.getInstance();

        Voice kevin16 = voiceManager.getVoice("kevin16");
        kevin16.allocate();

        String txt = "";
        Scanner scn = new Scanner(System.in);
        do {
            System.out.print("Input your TTS text: ");
            txt = scn.nextLine();
            if (!txt.equals("end"))
                kevin16.speak(txt);
        } while (!txt.equals("end"));

        kevin16.deallocate();

        Set<Integer> set = new TreeSet<>();
        set.add(1);
        System.out.println(set.toString());

        Map<String, Integer> map = new TreeMap<>();

        map.forEach((a, b) -> {
            System.out.println(a + " " + b);
        });

        System.exit(1312);

    }

}
