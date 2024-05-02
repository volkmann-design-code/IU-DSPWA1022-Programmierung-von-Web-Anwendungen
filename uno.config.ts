import {
  defineConfig,
  presetAttributify,
  presetIcons,
  presetTypography,
  presetUno,
  presetWebFonts,
  transformerDirectives,
  transformerVariantGroup,
} from "unocss";

export default defineConfig({
  shortcuts: {
    "text-muted": "text-[#ababab]",
    footer: "text-base text-muted",
    "top-content": "top-[7.5rem]",
    "bottom-content": "bottom-[3.1rem]",
    top: "top-[var(--slidev-content-padding-top)]",
    bottom: "bottom-[var(--slidev-content-padding-bottom)]",
    left: "left-[var(--slidev-content-padding-left)]",
    right: "right-[var(--slidev-content-padding-right)]",
  },
  presets: [
    presetUno(),
    presetAttributify(),
    presetIcons(),
    presetTypography(),
    presetWebFonts(),
  ],
  transformers: [transformerDirectives(), transformerVariantGroup()],
});
