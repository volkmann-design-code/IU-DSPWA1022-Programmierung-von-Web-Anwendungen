import { Controller, Get, ParseIntPipe, Query } from "@nestjs/common";
import { DictionaryService } from "./dictionary.service";
import { getRandomWord } from "src/utils/random";

@Controller("dictionary")
export class DictionaryController {
  constructor(private readonly dictionaryService: DictionaryService) {}

  @Get("alphabet")
  alphabet(): string[] {
    return this.dictionaryService.getAlphabet();
  }

  @Get("random-word")
  randomWord(
    @Query(
      "length",
      new ParseIntPipe({
        optional: true,
      }),
    )
    length = 10,
  ) {
    return getRandomWord(length);
  }
}
