# This file for Model M 122 key with terminal keys

remapblock
	
	# Function Keys
	
	F13 MEDIA_VOLUME_DOWN
    F14 MEDIA_VOLUME_UP
    F15 MEDIA_MUTE
    F16 MEDIA_PLAY_PAUSE    
    F17 MEDIA_PREV_TRACK
    F18 MEDIA_NEXT_TRACK
    F19 MEDIA_STOP
	
	# F20 TO F24 COULD GO TO APPS or something
	
	# Left side pad
	EXTRA_F1 ESC # SysRq/Attn
	
	# Arrow key remap
	LANG_4 DOWN
	DOWN RGUI
	
	# Num pad
	ESC NUM_LOCK
	NUM_LOCK PAD_SLASH
	SCROLL_LOCK PAD_ASTERIX
	EXTRA_SYSRQ PAD_MINUS
	PAD_ASTERIX PAD_PLUS
	PAD_MINUS TAB
	PAD_PLUS PAD_ENTER
	
	# misc
	EUROPE_1 BACKSLASH 

endblock

macroblock
	
	# Left hand pad
	macro EXTRA_F2        # blank key to right of SysRq/Attn
		MAKE LCTRL
		PRESS S
		BREAK LCTRL
		BREAK S
	endmacro

	macro EXTRA_F3       # Key below SysRq/Attn (clear)
		MAKE LCTRL 
		PRESS Z 
		BREAK LCTRL 
		BREAK Z 
	endmacro
	
	macro EXTRA_F4       # Erlnp key
		MAKE LCTRL 
		PRESS Y 
		BREAK LCTRL 
		BREAK Y
	endmacro

	macro EXTRA_F5       # setup key
		MAKE LCTRL 
		PRESS C 
		BREAK LCTRL 
		BREAK C 
	endmacro
	
	macro EXTRA_F6		 # blank key right of setup
		MAKE LCTRL
		PRESS V
		BREAK LCTRL
		BREAK C
	endmacro
	
	# macro EXTRA_F7     # HELP key
	
	# macro EXTRA_F8     # PLAY key
	
	macro EXTRA_F9		 # Print Key
		MAKE LGUI
		MAKE LSHIFT
		MAKE S
		BREAK LGUI
		BREAK LSHIFT
		BREAK S
	endmacro
	
	macro EXTRA_F10
		MAKE LCTRL
		MAKE LSHIFT
		MAKE S
		BREAK LCTRL
		BREAK LSHIFT
		BREAK S
	endmacro
endblock

