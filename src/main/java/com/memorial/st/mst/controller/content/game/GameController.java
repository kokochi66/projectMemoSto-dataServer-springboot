package com.memorial.st.mst.controller.content.game;

import com.memorial.st.mst.service.content.MusicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@Slf4j
@RequestMapping(value = "/game")
public class GameController {

    @Autowired
    private MusicService musicService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String gamePage(HttpServletResponse response, HttpServletRequest request) throws IOException {
        log.info("/game - gamePage");

        return "game";
    }

//    @GetMapping(value = "/getData")
//    @ResponseBody
//    public List<Music> getMusicList() {
//        Map<Long, List<ContentFile>> fileMap = contentFileService.getContentFileList().stream().collect(Collectors.groupingBy(ContentFile::getContentId));
//        List<Music> musicList = musicService.getMusicList();
//        musicList.forEach(music -> music.setContentFileList(fileMap.get(music.getMusicId())));
//        return musicList;
//    }
}
