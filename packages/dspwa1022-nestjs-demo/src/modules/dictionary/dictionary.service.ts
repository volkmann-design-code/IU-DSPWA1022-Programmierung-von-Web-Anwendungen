import { Injectable } from "@nestjs/common";

@Injectable()
export class DictionaryService {
  getAlphabet(): string[] {
    return Array.from("abcdefghijklmnopqrstuvwxyz");
  }
}
