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
